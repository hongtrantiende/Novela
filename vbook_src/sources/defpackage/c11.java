package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: c11  reason: default package */
/* loaded from: classes3.dex */
public interface c11 extends e11 {
    default void a(Throwable th) {
        Object obj;
        m42 d = d();
        if (th != null) {
            obj = new gs9(th);
        } else {
            e11.a.getClass();
            obj = pvc.a;
        }
        d.resumeWith(obj);
    }

    default void b() {
        m42 d = d();
        e11.a.getClass();
        d.resumeWith(pvc.a);
    }

    Throwable c();

    m42 d();
}
