package IteMode;

public class TCLTV implements TV{
    private Object[] objects={"CCTV1","CCTV2","CCTV3"};
    @Override
    public TVIte createIte() {
        return new TCLIte();
    }

    private class TCLIte implements TVIte{
        private int currentIndex=0;
        public void next(){
            if(currentIndex<objects.length){
                currentIndex++;
            }
        }
        public void previous(){
            if(currentIndex>0){
                currentIndex--;
            }
        }
        public void setChannel(int i){
            currentIndex=i;
        }
        public Object currentChannel(){
            return objects[currentIndex];
        }
        public boolean isLast(){
            return currentIndex==objects.length;
        }

        @Override
        public boolean isFirst() {
            return false;
        }
    }
}
