package defpackage;

import java.util.Iterator;
import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: mr5  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class mr5 implements xt4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;
    public final /* synthetic */ int c;

    public /* synthetic */ mr5(float f, int i, int i2) {
        this.a = i2;
        this.b = f;
        this.c = i;
    }

    @Override // defpackage.xt4
    public final Object invoke(Object obj) {
        Object obj2;
        Object obj3;
        int i = this.a;
        Integer num = null;
        int i2 = 0;
        int i3 = -1;
        int i4 = this.c;
        float f = this.b;
        List list = (List) obj;
        switch (i) {
            case 0:
                Iterator it = list.iterator();
                int i5 = 0;
                while (true) {
                    if (it.hasNext()) {
                        vh8 vh8Var = (vh8) it.next();
                        if (!(vh8Var instanceof po5) || vh8Var.b != i4) {
                            i5++;
                        }
                    } else {
                        i5 = -1;
                    }
                }
                if (i5 >= 0) {
                    list.get(i5).getClass();
                    i2 = i5 + ((int) (((po5) obj2).e * f));
                } else {
                    Iterator it2 = list.iterator();
                    int i6 = 0;
                    while (true) {
                        if (it2.hasNext()) {
                            if (((vh8) it2.next()).b == i4) {
                                i3 = i6;
                            } else {
                                i6++;
                            }
                        }
                    }
                    Integer valueOf = Integer.valueOf(i3);
                    if (i3 >= 0) {
                        num = valueOf;
                    }
                    if (num != null) {
                        i2 = num.intValue();
                    }
                }
                return Integer.valueOf(i2);
            default:
                Iterator it3 = list.iterator();
                int i7 = 0;
                while (true) {
                    if (it3.hasNext()) {
                        wh8 wh8Var = (wh8) it3.next();
                        if (!(wh8Var instanceof gwb) || wh8Var.b != i4) {
                            i7++;
                        }
                    } else {
                        i7 = -1;
                    }
                }
                if (i7 >= 0) {
                    list.get(i7).getClass();
                    i2 = i7 + ((int) (((gwb) obj3).f * f));
                } else {
                    Iterator it4 = list.iterator();
                    int i8 = 0;
                    while (true) {
                        if (it4.hasNext()) {
                            if (((wh8) it4.next()).b == i4) {
                                i3 = i8;
                            } else {
                                i8++;
                            }
                        }
                    }
                    Integer valueOf2 = Integer.valueOf(i3);
                    if (i3 >= 0) {
                        num = valueOf2;
                    }
                    if (num != null) {
                        i2 = num.intValue();
                    }
                }
                return Integer.valueOf(i2);
        }
    }
}
