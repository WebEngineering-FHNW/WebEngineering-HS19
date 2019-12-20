package webec;

class SpoofController {

    def index() {
        String result = request
            .getHeader("user-agent")

        render text: result
    }

}
