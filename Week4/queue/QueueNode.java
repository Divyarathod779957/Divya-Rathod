package queue;

class QueueNode {
    String dataItem;
    QueueNode next;

    QueueNode(String entry){
        dataItem = entry;
        next = null;
    }


    public int isEmpty() {
        return 1;
    }
}
