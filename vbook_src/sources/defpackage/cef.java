package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: cef  reason: default package */
/* loaded from: classes.dex */
public final class cef {
    public static final cef d = new cef("", "", false);
    public final String a;
    public final String b;
    public final boolean c;

    static {
        new cef("\n", "  ", true);
    }

    public cef(String str, String str2, boolean z) {
        if (str.matches("[\r\n]*")) {
            if (str2.matches("[ \t]*")) {
                this.a = str;
                this.b = str2;
                this.c = z;
                return;
            }
            vs.m("Only combinations of spaces and tabs are allowed in indent.");
            throw null;
        }
        vs.m("Only combinations of \\n and \\r are allowed in newline.");
        throw null;
    }
}
