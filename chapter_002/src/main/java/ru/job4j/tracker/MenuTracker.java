package ru.job4j.tracker;

import java.util.function.Consumer;

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
     *функциональный интерфейс Consumer.
     */
    private final Consumer<String> output;
    /**
     * The actions of user.
     */
    private UserAction[] actions = new UserAction[7];
    /**
     * The constructor initializing the field.
     * @param input enter data.
     * @param tracker safe orders.
     * @param output output
     */
    public MenuTracker(Input input, Tracker tracker, Consumer<String> output) {
        this.input = input;
        this.tracker = tracker;
        this.output = output;
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
        this.actions[0] = new CreateItem(0, "Create Item");
        this.actions[1] = new ShowAllItem(1, "Show All Item");
        this.actions[2] = new EditItem(2, "Edit item");
        this.actions[3] = new DeleteItem(3, "Delete item");
        this.actions[4] = new FindByIdItem(4, "Find by id item");
        this.actions[5] = new FindByNameItem(5, "Find by name item");
        this.actions[6] = new Exit(6, "EXIT");
    }

    /**
     * menu output method.
     */
    public void showMenu() {
        for (UserAction action : this.actions) {
            if (action != null) {
                this.output.accept(action.info());
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
    private class CreateItem extends BaseAction {
        /**
         *constructor.
         * @param key key
         * @param name name
         */
        private CreateItem(int key, String name) {
            super(key, name);
        }

        @Override
        public void execute(Input input, Tracker tracker) {
            String name = input.ask("input name order :");
            String desc = input.ask("input description order :");
            tracker.add(new Item(name, desc));
        }
    }
    /**
     * class ShowAllItem.
     */
    private class ShowAllItem extends BaseAction {
        /**
         *constructor.
         * @param key key
         * @param name name
         */
        private ShowAllItem(int key, String name) {
            super(key, name);
        }
        @Override
        public void execute(Input input, Tracker tracker) {
            int index = 1;
            for (Item item: tracker.findAll()) {
                output.accept(String.format("%s id order : %s name order : %s description order: %s created order: %s", index++, item.getId(), item.getName(), item.getDesk(), item.getCreated()));
            }
        }
    }

    /**
     * class EditItem.
     */
    class EditItem extends BaseAction {
        /**
         *constructor.
         * @param key key
         * @param name name
         */
        protected EditItem(int key, String name) {
            super(key, name);
        }

        @Override
        public void execute(Input input, Tracker tracker) {
            String id = input.ask("input id:");
            String name = input.ask("input name order :");
            String desc = input.ask("input description order :");
            tracker.replace(id, new Item(name, desc));
        }
    }

    /**
     * class DeleteItem.
     */
    class DeleteItem extends BaseAction {
        /**
         *constructor.
         * @param key key
         * @param name name
         */
        protected DeleteItem(int key, String name) {
            super(key, name);
        }
        @Override
        public void execute(Input input, Tracker tracker) {
            String id = input.ask("input id:");
            tracker.delete(id);
        }
    }
    /**
     * class FindByIdItem.
     */
    class FindByIdItem extends BaseAction {
        /**
         *constructor.
         * @param key key
         * @param name name
         */
        protected FindByIdItem(int key, String name) {
            super(key, name);
        }
        @Override
        public void execute(Input input, Tracker tracker) {
            String id = input.ask("input id:");
            Item item = tracker.findById(id);
            output.accept(String.format("id order : %s name order : %s description order: %s created order: %s", item.getId(), item.getName(), item.getDesk(), item.getCreated()));
        }
    }
    /**
     * class FindByIdName.
     */
    class FindByNameItem extends BaseAction {

        /**
         *constructor.
         * @param key key
         * @param name name
         */
        protected FindByNameItem(int key, String name) {
            super(key, name);
        }
        @Override
        public void execute(Input input, Tracker tracker) {
            String name = input.ask("input name:");
            for (Item item : tracker.findByName(name)) {
                output.accept(String.format("id order : %s name order : %s description order: %s created order: %s", item.getId(), item.getName(), item.getDesk(), item.getCreated()));
            }
        }
    }
}
/**
 * class Exit.
 */
class Exit extends BaseAction {
    /**
     *constructor.
     * @param key key
     * @param name name
     */
    protected Exit(int key, String name) {
        super(key, name);
    }
    @Override
    public void execute(Input input, Tracker tracker) {
        System.out.println("EXIT");
    }
}