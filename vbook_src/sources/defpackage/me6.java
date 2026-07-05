package defpackage;

import java.nio.charset.Charset;
import java.util.ArrayList;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: me6  reason: default package */
/* loaded from: classes.dex */
public final class me6 extends ow4 {
    public static final int CHILDREN_FIELD_NUMBER = 7;
    private static final me6 DEFAULT_INSTANCE;
    public static final int HASACTION_FIELD_NUMBER = 9;
    public static final int HAS_IMAGE_COLOR_FILTER_FIELD_NUMBER = 11;
    public static final int HAS_IMAGE_DESCRIPTION_FIELD_NUMBER = 10;
    public static final int HEIGHT_FIELD_NUMBER = 3;
    public static final int HORIZONTAL_ALIGNMENT_FIELD_NUMBER = 4;
    public static final int IDENTITY_FIELD_NUMBER = 8;
    public static final int IMAGE_SCALE_FIELD_NUMBER = 6;
    private static volatile vm8 PARSER = null;
    public static final int TYPE_FIELD_NUMBER = 1;
    public static final int VERTICAL_ALIGNMENT_FIELD_NUMBER = 5;
    public static final int WIDTH_FIELD_NUMBER = 2;
    private sz5 children_ = a99.d;
    private boolean hasAction_;
    private boolean hasImageColorFilter_;
    private boolean hasImageDescription_;
    private int height_;
    private int horizontalAlignment_;
    private int identity_;
    private int imageScale_;
    private int type_;
    private int verticalAlignment_;
    private int width_;

    static {
        me6 me6Var = new me6();
        DEFAULT_INSTANCE = me6Var;
        ow4.i(me6.class, me6Var);
    }

    public static void k(me6 me6Var, ne6 ne6Var) {
        me6Var.getClass();
        if (ne6Var != ne6.UNRECOGNIZED) {
            me6Var.type_ = ne6Var.a;
        } else {
            vs.m("Can't get the number of an unknown enum value.");
        }
    }

    public static void l(me6 me6Var, fe6 fe6Var) {
        me6Var.getClass();
        me6Var.width_ = fe6Var.a();
    }

    public static void m(me6 me6Var, fe6 fe6Var) {
        me6Var.getClass();
        me6Var.height_ = fe6Var.a();
    }

    public static void n(me6 me6Var, ge6 ge6Var) {
        me6Var.getClass();
        if (ge6Var != ge6.UNRECOGNIZED) {
            me6Var.horizontalAlignment_ = ge6Var.a;
        } else {
            vs.m("Can't get the number of an unknown enum value.");
        }
    }

    public static void o(me6 me6Var, oe6 oe6Var) {
        me6Var.getClass();
        if (oe6Var != oe6.UNRECOGNIZED) {
            me6Var.verticalAlignment_ = oe6Var.a;
        } else {
            vs.m("Can't get the number of an unknown enum value.");
        }
    }

    public static void p(me6 me6Var, ee6 ee6Var) {
        me6Var.getClass();
        if (ee6Var != ee6.UNRECOGNIZED) {
            me6Var.imageScale_ = ee6Var.a;
        } else {
            vs.m("Can't get the number of an unknown enum value.");
        }
    }

    public static void q(me6 me6Var) {
        me6Var.getClass();
        me6Var.identity_ = 1;
    }

    public static void r(me6 me6Var, boolean z) {
        me6Var.hasAction_ = z;
    }

    public static void s(me6 me6Var, ArrayList arrayList) {
        int i;
        sz5 sz5Var = me6Var.children_;
        if (!((a99) sz5Var).a) {
            a99 a99Var = (a99) sz5Var;
            int i2 = a99Var.c;
            if (i2 == 0) {
                i = 10;
            } else {
                i = i2 * 2;
            }
            me6Var.children_ = a99Var.c(i);
        }
        sz5 sz5Var2 = me6Var.children_;
        Charset charset = uz5.a;
        if (sz5Var2 instanceof ArrayList) {
            ((ArrayList) sz5Var2).ensureCapacity(arrayList.size() + ((a99) sz5Var2).c);
        }
        a99 a99Var2 = (a99) sz5Var2;
        int i3 = a99Var2.c;
        int size = arrayList.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayList.get(i4);
            i4++;
            if (obj == null) {
                String str = "Element at index " + (a99Var2.c - i3) + " is null.";
                for (int i5 = a99Var2.c - 1; i5 >= i3; i5--) {
                    a99Var2.remove(i5);
                }
                xk5.k(str);
                return;
            }
            a99Var2.add(obj);
        }
    }

    public static void t(me6 me6Var, boolean z) {
        me6Var.hasImageDescription_ = z;
    }

    public static void u(me6 me6Var, boolean z) {
        me6Var.hasImageColorFilter_ = z;
    }

    public static me6 v() {
        return DEFAULT_INSTANCE;
    }

    public static le6 w() {
        return (le6) ((iw4) DEFAULT_INSTANCE.b(5));
    }

    /* JADX WARN: Type inference failed for: r12v12, types: [vm8, java.lang.Object] */
    @Override // defpackage.ow4
    public final Object b(int i) {
        vm8 vm8Var;
        switch (a82.C(i)) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new ch9(DEFAULT_INSTANCE, "\u0000\u000b\u0000\u0000\u0001\u000b\u000b\u0000\u0001\u0000\u0001\f\u0002\f\u0003\f\u0004\f\u0005\f\u0006\f\u0007\u001b\b\f\t\u0007\n\u0007\u000b\u0007", new Object[]{"type_", "width_", "height_", "horizontalAlignment_", "verticalAlignment_", "imageScale_", "children_", me6.class, "identity_", "hasAction_", "hasImageDescription_", "hasImageColorFilter_"});
            case 3:
                return new me6();
            case 4:
                return new iw4(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                vm8 vm8Var2 = PARSER;
                if (vm8Var2 == null) {
                    synchronized (me6.class) {
                        try {
                            vm8 vm8Var3 = PARSER;
                            vm8Var = vm8Var3;
                            if (vm8Var3 == null) {
                                ?? obj = new Object();
                                PARSER = obj;
                                vm8Var = obj;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    return vm8Var;
                }
                return vm8Var2;
            default:
                cp8.q();
                return null;
        }
    }
}
