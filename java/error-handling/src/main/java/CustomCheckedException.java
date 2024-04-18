class CustomCheckedException extends Exception {

    CustomCheckedException(){
        super();
    }

    CustomCheckedException(String message) {
        super("This is the detail message.");
    }

}
