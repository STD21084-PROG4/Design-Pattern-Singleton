public enum ClassUniqueInstance {

    INSTANCE (45);

    private int click;

    private ClassUniqueInstance (int click){
        this.click = click ;
    }

    private ClassUniqueInstance getInstance () {
        return INSTANCE;
    }

    public int getClick (){
        return click ;
    }

    public void setClick(int click) {
        this.click = click;
    }
}
