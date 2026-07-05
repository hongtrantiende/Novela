package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import java.util.Iterator;
import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: pp5  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class pp5 implements xt4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;

    public /* synthetic */ pp5(int i, int i2, int i3) {
        this.a = i3;
        this.b = i;
        this.c = i2;
    }

    @Override // defpackage.xt4
    public final Object invoke(Object obj) {
        int i = this.a;
        Integer num = null;
        int i2 = -1;
        boolean z = true;
        int i3 = 0;
        int i4 = this.c;
        int i5 = this.b;
        switch (i) {
            case 0:
                byte[] bArr = (byte[]) obj;
                bArr.getClass();
                BitmapFactory.Options options = new BitmapFactory.Options();
                if (i5 > i4) {
                    options.inDensity = i5;
                    options.inTargetDensity = i4;
                }
                Bitmap decodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
                decodeByteArray.getClass();
                return new yl5(new jj(decodeByteArray));
            case 1:
                frb frbVar = (frb) obj;
                if (i5 < 0 || i4 < 0) {
                    ov5.a("Expected lengthBeforeCursor and lengthAfterCursor to be non-negative, were " + i5 + " and " + i4 + " respectively.");
                }
                int i6 = 0;
                int i7 = 0;
                while (true) {
                    if (i6 < i5) {
                        int i8 = i7 + 1;
                        long j = frbVar.f;
                        tb1 tb1Var = frbVar.c;
                        int g = fxb.g(j);
                        long j2 = frbVar.f;
                        if (g > i8) {
                            char charAt = tb1Var.charAt((fxb.g(j2) - i8) - 1);
                            char charAt2 = tb1Var.charAt(fxb.g(frbVar.f) - i8);
                            if (Character.isHighSurrogate(charAt) && Character.isLowSurrogate(charAt2)) {
                                i7 += 2;
                            } else {
                                i7 = i8;
                            }
                            i6++;
                        } else {
                            i7 = fxb.g(j2);
                        }
                    }
                }
                int i9 = 0;
                while (true) {
                    if (i3 < i4) {
                        int i10 = i9 + 1;
                        long j3 = frbVar.f;
                        tb1 tb1Var2 = frbVar.c;
                        if (fxb.f(j3) + i10 < tb1Var2.length()) {
                            char charAt3 = tb1Var2.charAt((fxb.f(frbVar.f) + i10) - 1);
                            char charAt4 = tb1Var2.charAt(fxb.f(frbVar.f) + i10);
                            if (Character.isHighSurrogate(charAt3) && Character.isLowSurrogate(charAt4)) {
                                i9 += 2;
                            } else {
                                i9 = i10;
                            }
                            i3++;
                        } else {
                            i9 = tb1Var2.length() - fxb.f(frbVar.f);
                        }
                    }
                }
                b23.l(frbVar, fxb.f(frbVar.f), fxb.f(frbVar.f) + i9);
                b23.l(frbVar, fxb.g(frbVar.f) - i7, fxb.g(frbVar.f));
                return pvc.a;
            case 2:
                yk8 yk8Var = (yk8) obj;
                return hl5.o("| ", e97.n(i5, (String) yk8Var.a), " | ", e97.n(i4, (String) yk8Var.b), " |");
            case 3:
                long j4 = ((fxb) obj).a;
                if (((int) (j4 >> 32)) < i5 || ((int) (4294967295L & j4)) > i4) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 4:
                List list = (List) obj;
                Iterator it = list.iterator();
                int i11 = 0;
                while (true) {
                    if (it.hasNext()) {
                        wh8 wh8Var = (wh8) it.next();
                        if (!(wh8Var instanceof gwb) || wh8Var.b != i5 || i4 >= ((gwb) wh8Var).g.c) {
                            i11++;
                        }
                    } else {
                        i11 = -1;
                    }
                }
                if (i11 >= 0) {
                    i3 = i11;
                } else {
                    Iterator it2 = list.iterator();
                    int i12 = 0;
                    while (true) {
                        if (it2.hasNext()) {
                            if (((wh8) it2.next()).b == i5) {
                                i2 = i12;
                            } else {
                                i12++;
                            }
                        }
                    }
                    Integer valueOf = Integer.valueOf(i2);
                    if (i2 >= 0) {
                        num = valueOf;
                    }
                    if (num != null) {
                        i3 = num.intValue();
                    }
                }
                return Integer.valueOf(i3);
            default:
                List list2 = (List) obj;
                Iterator it3 = list2.iterator();
                int i13 = 0;
                while (true) {
                    if (it3.hasNext()) {
                        wh8 wh8Var2 = (wh8) it3.next();
                        if (!(wh8Var2 instanceof gwb) || wh8Var2.b != i4) {
                            i13++;
                        }
                    } else {
                        i13 = -1;
                    }
                }
                if (i13 >= 0) {
                    Object obj2 = list2.get(i13);
                    obj2.getClass();
                    i3 = dce.n(i5, 0, ((gwb) obj2).f - 1) + i13;
                } else {
                    Iterator it4 = list2.iterator();
                    int i14 = 0;
                    while (true) {
                        if (it4.hasNext()) {
                            if (((wh8) it4.next()).b == i4) {
                                i2 = i14;
                            } else {
                                i14++;
                            }
                        }
                    }
                    Integer valueOf2 = Integer.valueOf(i2);
                    if (i2 >= 0) {
                        num = valueOf2;
                    }
                    if (num != null) {
                        i3 = num.intValue();
                    }
                }
                return Integer.valueOf(i3);
        }
    }
}
