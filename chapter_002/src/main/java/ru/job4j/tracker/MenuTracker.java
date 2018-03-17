package ru.job4j.tracker;
/**
 * class MenuTracker.
 *
 * @author Maxim Borisov (mail: mixed2004@mail.ru)
 * @version 1
 * @since 12.03.2018
 */
public class MenuTracker {
    /**
     * Getting data from the user.
     */
    private Input input;
    /**
     * The order store.
     */
    private Tracker tracker;
    /**
     * The actions of user.
     */
    private UserAction[] actions = new UserAction[7];
    /**
     * The constructor initializing the field.
     * @param input enter data.
     * @param tracker safe orders.
     */
    public MenuTracker(Input input, Tracker tracker) {
        this.input = input;
        this.tracker = tracker;
    }

    /**
     * method of getting possible user actions keys.
     * @return numberActions array.
     */
    public int[] getActions() {
        int[] numberActions = new int[actions.length];
        for (int index = 0; index < actions.length; index++) {
            numberActions[index] = actions[index].key();
        }
        return numberActions;
    }
    /**
     * method of filling possible user actions.
     */
    public void fillActions() {
        this.actions[0] = new CreateItem();
        this.actions[1] = new ShowAllItem();
        this.actions[2] = new EditItem();
        this.actions[3] = new DeleteItem();
        this.actions[4] = new FindByIdItem();
        this.actions[5] = new FindByNameItem();
        this.actions[6] = new Exit();
    }

    /**
     * menu output method.
     */
    public void showMenu() {
        for (UserAction action : this.actions) {
            if (action != null) {
                System.out.println(action.info());
            }
        }
    }

    /**
     * menu selection method.
     * @param key selection user
     */
    public void select(int key) {
        this.actions[key].execute(this.input, this.tracker);
    }

    /**
     * class CreateItem.
     */
    private class CreateItem implements UserAction {
        @Override
        public int key() {
            return  0;
        }

        @Override
        public void execute(Input input, Tracker tracker) {
            String name = input.ask("input name order :");
            String desc = input.ask("input description order :");
            tracker.add(new Item(name, desc));
        }

        @Override
        public String info() {
            return String.format("%s. %s", this.key(), "Create new item");
        }
    }
    /**
     * class CreateItem.
     */
    private static class ShowAllItem implements UserAction {
        @Override
        public int key() {
            return  1;
        }

        @Override
        public void execute(Input input, Tracker tracker) {
            int index = 1;
            for (Item item: tracker.findAll()) {
                System.out.println(String.format("%s id order : %s name order : %s description order: %s created order: %s", index++, item.getId(), item.getName(), item.getDesk(), item.getCreated()));
                //               System.out.println(index + ": " + "id order : " + arrayItems[index].getId() + " " + "name order : "  + arrayItems[index].getName() + " " + "description order: " + arrayItems[index].getDesk() + " " + "created order: " + arrayItems[index].getCreated());
            }
        }

        @Override
        public String info() {
            return String.format("%s. %s", this.key(), "All items");
        }
    }
}
/**
 * class EditItem.
 */
class EditItem implements UserAction {
    @Override
    public int key() {
        return  2;
    }

    @Override
    public void execute(Input input, Tracker tracker) {
        String id = input.ask("input id:");
        String name = input.ask("input name order :");
        String desc = input.ask("input description order :");
        tracker.replace(id, new Item(name, desc));
    }

    @Override
    public String info() {
        return String.format("%s. %s", this.key(), "Edit item");
    }
}


/**
 * class DeleteItem.
 */
class DeleteItem implements UserAction {
    @Override
    public int key() {
        return  3;
    }

    @Override
    public void execute(Input input, Tracker tracker) {
        String id = input.ask("input id:");
        tracker.delete(id);
    }

    @Override
    public String info() {
        return String.format("%s. %s", this.key(), "delete item");
    }
}
/**
 * class FindByIdItem.
 */
class FindByIdItem implements UserAction {
    @Override
    public int key() {
        return  4;
    }

    @Override
    public void execute(Input input, Tracker tracker) {
        String id = input.ask("input id:");
        Item item = tracker.findById(id);
        System.out.println(String.format("id order : %s name order : %s description order: %s created order: %s", item.getId(), item.getName(), item.getDesk(), item.getCreated()));
    }
    @Override
    public String info() {
        return String.format("%s. %s", this.key(), "find by id item");
    }
}
/**
 * class FindByIdName.
 */
class FindByNameItem implements UserAction {
    @Override
    public int key() {
        return  5;
    }

    @Override
    public void execute(Input input, Tracker tracker) {
        String name = input.ask("input name:");
        for (Item item : tracker.findByName(name)) {
            System.out.println(String.format("id order : %s name order : %s description order: %s created order: %s", item.getId(), item.getName(), item.getDesk(), item.getCreated()));
        }
    }
    @Override
    public String info() {
        return String.format("%s. %s", this.key(), "find by name item");
    }
}
/**
 * class Exit.
 */
class Exit implements UserAction {
    @Override
    public int key() {
        return  6;
    }

    @Override
    public void execute(Input input, Tracker tracker) {
        System.out.println("EXIT");
    }
    @Override
    public String info() {
        return String.format("%s. %s", this.key(), "EXIT");
    }
}