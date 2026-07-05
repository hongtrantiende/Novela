package defpackage;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: u49  reason: default package */
/* loaded from: classes.dex */
public final class u49 extends qw4 {
    private static final u49 DEFAULT_INSTANCE;
    private static volatile wm8 PARSER = null;
    public static final int STRINGS_FIELD_NUMBER = 1;
    private tz5 strings_ = c99.d;

    static {
        u49 u49Var = new u49();
        DEFAULT_INSTANCE = u49Var;
        qw4.k(u49.class, u49Var);
    }

    public static void m(u49 u49Var, Iterable iterable) {
        int i;
        tz5 tz5Var = u49Var.strings_;
        if (!((c99) tz5Var).a) {
            c99 c99Var = (c99) tz5Var;
            int i2 = c99Var.c;
            if (i2 == 0) {
                i = 10;
            } else {
                i = i2 * 2;
            }
            u49Var.strings_ = c99Var.c(i);
        }
        tz5 tz5Var2 = u49Var.strings_;
        Charset charset = wz5.a;
        if (iterable instanceof rk6) {
            List o = ((rk6) iterable).o();
            if (tz5Var2 == null) {
                ((c99) tz5Var2).getClass();
                Iterator it = o.iterator();
                if (it.hasNext()) {
                    Object next = it.next();
                    next.getClass();
                    if (!(next instanceof c31)) {
                        if (next instanceof byte[]) {
                            byte[] bArr = (byte[]) next;
                            c31.c(bArr, 0, bArr.length);
                            throw null;
                        }
                        String str = (String) next;
                        throw null;
                    }
                    throw null;
                }
                return;
            }
            vm1.h();
        } else if (iterable instanceof x59) {
            ((c99) tz5Var2).addAll((Collection) iterable);
        } else {
            if ((tz5Var2 instanceof ArrayList) && (iterable instanceof Collection)) {
                ((ArrayList) tz5Var2).ensureCapacity(((Collection) iterable).size() + ((c99) tz5Var2).c);
            }
            c99 c99Var2 = (c99) tz5Var2;
            int i3 = c99Var2.c;
            for (Object obj : iterable) {
                if (obj == null) {
                    String str2 = "Element at index " + (c99Var2.c - i3) + " is null.";
                    for (int i4 = c99Var2.c - 1; i4 >= i3; i4--) {
                        c99Var2.remove(i4);
                    }
                    xk5.k(str2);
                    return;
                }
                c99Var2.add(obj);
            }
        }
    }

    public static u49 n() {
        return DEFAULT_INSTANCE;
    }

    public static t49 p() {
        return (t49) ((kw4) DEFAULT_INSTANCE.d(5));
    }

    /* JADX WARN: Type inference failed for: r2v13, types: [wm8, java.lang.Object] */
    @Override // defpackage.qw4
    public final Object d(int i) {
        wm8 wm8Var;
        switch (a82.C(i)) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new eh9(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"strings_"});
            case 3:
                return new u49();
            case 4:
                return new kw4(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                wm8 wm8Var2 = PARSER;
                if (wm8Var2 == null) {
                    synchronized (u49.class) {
                        try {
                            wm8 wm8Var3 = PARSER;
                            wm8Var = wm8Var3;
                            if (wm8Var3 == null) {
                                ?? obj = new Object();
                                PARSER = obj;
                                wm8Var = obj;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    return wm8Var;
                }
                return wm8Var2;
            default:
                cp8.q();
                return null;
        }
    }

    public final tz5 o() {
        return this.strings_;
    }
}
