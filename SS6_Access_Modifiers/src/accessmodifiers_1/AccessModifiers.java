package accessmodifiers_1;

public class AccessModifiers {
    public String _public ;
    protected String _protected;
    String _default;
    private String  _private ;

    public AccessModifiers() {
        this._private = "private";
        this._public = "public";
        this._protected = "protected";
        this._default = "default";
    }

    public String get_private() {
        return _private;
    }

    public void set_private(String _private) {
        this._private = _private;
    }

}
