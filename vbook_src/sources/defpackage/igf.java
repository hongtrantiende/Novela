package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: igf  reason: default package */
/* loaded from: classes.dex */
public final class igf extends jgf {
    public static final jgf e;
    public static final jgf f;

    static {
        jgf b = new jgf(null, new jla(0)).b();
        e = b;
        jgf jgfVar = new jgf(b, new jla(0));
        Boolean bool = Boolean.TRUE;
        wq9.C("Can't mutate after handing to trace", !jgfVar.c);
        wq9.C("Key already present", !jgfVar.c());
        jgfVar.b.put(jgf.d, bool);
        f = jgfVar.b();
    }
}
