package day_46_this_isa;

public class Message {
    private String body;
    private String sender;
    private String receiver;

    public String toString() {
        return "Message{" +
                "body='" + body + '\'' +
                ", sender='" + sender + '\'' +
                ", receiver='" + receiver + '\'' +
                '}';
    }


    public Message(String body, String sender, String receiver) {
        this.body = body;
        this.sender = sender;
        this.receiver = receiver;
    }
    //overload the constructor

    public Message(String body) {
        this.body = body;
        this.sender = "Unknown";
        this.receiver = "Unknown";


    }

    public Message(String body, String receiver) {
        this.body = body;
        this.sender = "Unknown";
        this.receiver = "receiver";

    }

    public Message() {
        this.body = "";
        sender = "Unknown";
        receiver = "Unknown";



        }

        public void setBody (String body){
            this.body = body;
        }

        public String getSender () {
            return sender;
        }

        public void setSender (String sender){
            this.sender = sender;
        }

        public String getReceiver () {
            return receiver;
        }

        public void setReceiver (String receiver){
            this.receiver = receiver;
        }
    }


