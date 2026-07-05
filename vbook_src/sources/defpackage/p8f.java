package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: p8f  reason: default package */
/* loaded from: classes.dex */
public abstract class p8f {
    public static final h8f a;
    public static final h8f b;
    public static final o7f c;

    static {
        g8f g8fVar = g8f.f;
        g8f g8fVar2 = g8f.d;
        f8f f8fVar = f8f.b;
        try {
            odd b2 = h8f.b();
            b2.b = 32;
            b2.c = 16;
            b2.e = f8fVar;
            b2.d = g8fVar2;
            a = b2.j();
            try {
                odd b3 = h8f.b();
                b3.b = 32;
                b3.c = 32;
                b3.e = f8fVar;
                b3.d = g8fVar2;
                b3.j();
                try {
                    odd b4 = h8f.b();
                    b4.b = 64;
                    b4.c = 32;
                    b4.e = f8fVar;
                    b4.d = g8fVar;
                    b4.j();
                    try {
                        odd b5 = h8f.b();
                        b5.b = 64;
                        b5.c = 64;
                        b5.e = f8fVar;
                        b5.d = g8fVar;
                        b = b5.j();
                        try {
                            jje b6 = o7f.b();
                            b6.h(32);
                            b6.j(16);
                            b6.c = oce.G;
                            c = b6.f();
                        } catch (Exception e) {
                            throw new gt1(15, e);
                        }
                    } catch (Exception e2) {
                        throw new gt1(15, e2);
                    }
                } catch (Exception e3) {
                    throw new gt1(15, e3);
                }
            } catch (Exception e4) {
                throw new gt1(15, e4);
            }
        } catch (Exception e5) {
            throw new gt1(15, e5);
        }
    }
}
