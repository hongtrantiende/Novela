package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: fw4  reason: default package */
/* loaded from: classes.dex */
public final class fw4 implements ja7 {
    public static final fw4 b = new fw4(0);
    public final /* synthetic */ int a;

    public /* synthetic */ fw4(int i) {
        this.a = i;
    }

    @Override // defpackage.ja7
    public final ch9 a(Class cls) {
        switch (this.a) {
            case 0:
                if (ow4.class.isAssignableFrom(cls)) {
                    try {
                        return (ch9) ow4.c(cls.asSubclass(ow4.class)).b(3);
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

    @Override // defpackage.ja7
    public final boolean b(Class cls) {
        switch (this.a) {
            case 0:
                return ow4.class.isAssignableFrom(cls);
            default:
                return false;
        }
    }
}
