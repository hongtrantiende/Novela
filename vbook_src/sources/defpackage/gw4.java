package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: gw4  reason: default package */
/* loaded from: classes.dex */
public final class gw4 implements ka7 {
    public static final gw4 b = new gw4(0);
    public final /* synthetic */ int a;

    public /* synthetic */ gw4(int i) {
        this.a = i;
    }

    @Override // defpackage.ka7
    public final dh9 a(Class cls) {
        switch (this.a) {
            case 0:
                if (pw4.class.isAssignableFrom(cls)) {
                    try {
                        return (dh9) pw4.b(cls.asSubclass(pw4.class)).a(3);
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

    @Override // defpackage.ka7
    public final boolean b(Class cls) {
        switch (this.a) {
            case 0:
                return pw4.class.isAssignableFrom(cls);
            default:
                return false;
        }
    }
}
