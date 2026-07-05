package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: hw4  reason: default package */
/* loaded from: classes.dex */
public final class hw4 implements la7 {
    public static final hw4 b = new hw4(0);
    public final /* synthetic */ int a;

    public /* synthetic */ hw4(int i) {
        this.a = i;
    }

    @Override // defpackage.la7
    public final eh9 a(Class cls) {
        switch (this.a) {
            case 0:
                if (qw4.class.isAssignableFrom(cls)) {
                    try {
                        return (eh9) qw4.e(cls.asSubclass(qw4.class)).d(3);
                    } catch (Exception e) {
                        cp8.p("Unable to get message info for ".concat(cls.getName()), e);
                        return null;
                    }
                }
                vs.m("Unsupported message type: ".concat(cls.getName()));
                return null;
            default:
                throw new IllegalStateException("This should never be called.");
        }
    }

    @Override // defpackage.la7
    public final boolean b(Class cls) {
        switch (this.a) {
            case 0:
                return qw4.class.isAssignableFrom(cls);
            default:
                return false;
        }
    }
}
