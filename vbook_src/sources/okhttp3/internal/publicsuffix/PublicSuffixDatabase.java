package okhttp3.internal.publicsuffix;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.IDN;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import okhttp3.internal._UtilCommonKt;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes3.dex */
public final class PublicSuffixDatabase {
    public static final e31 b;
    public static final List c;
    public static final PublicSuffixDatabase d;
    public final AssetPublicSuffixList a;

    /* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
    /* loaded from: classes3.dex */
    public static final class Companion {
        public static final String a(e31 e31Var, e31[] e31VarArr, int i) {
            int i2;
            boolean z;
            int i3;
            int i4;
            e31 e31Var2 = PublicSuffixDatabase.b;
            int e = e31Var.e();
            int i5 = 0;
            while (i5 < e) {
                int i6 = (i5 + e) / 2;
                while (i6 > -1 && e31Var.j(i6) != 10) {
                    i6--;
                }
                int i7 = i6 + 1;
                int i8 = 1;
                while (true) {
                    i2 = i7 + i8;
                    if (e31Var.j(i2) == 10) {
                        break;
                    }
                    i8++;
                }
                int i9 = i2 - i7;
                int i10 = i;
                boolean z2 = false;
                int i11 = 0;
                int i12 = 0;
                while (true) {
                    if (z2) {
                        i3 = 46;
                        z = false;
                    } else {
                        byte j = e31VarArr[i10].j(i11);
                        byte[] bArr = _UtilCommonKt.a;
                        int i13 = j & 255;
                        z = z2;
                        i3 = i13;
                    }
                    byte j2 = e31Var.j(i7 + i12);
                    byte[] bArr2 = _UtilCommonKt.a;
                    i4 = i3 - (j2 & 255);
                    if (i4 != 0) {
                        break;
                    }
                    i12++;
                    i11++;
                    if (i12 == i9) {
                        break;
                    } else if (e31VarArr[i10].e() == i11) {
                        if (i10 == e31VarArr.length - 1) {
                            break;
                        }
                        i10++;
                        i11 = -1;
                        z2 = true;
                    } else {
                        z2 = z;
                    }
                }
                if (i4 >= 0) {
                    if (i4 <= 0) {
                        int i14 = i9 - i12;
                        int e2 = e31VarArr[i10].e() - i11;
                        int length = e31VarArr.length;
                        for (int i15 = i10 + 1; i15 < length; i15++) {
                            e2 += e31VarArr[i15].e();
                        }
                        if (e2 >= i14) {
                            if (e2 <= i14) {
                                return e31Var.p(i7, i9 + i7).o(ed1.a);
                            }
                        }
                    }
                    i5 = i2 + 1;
                }
                e = i6;
            }
            return null;
        }
    }

    static {
        e31 e31Var = e31.d;
        b = new e31(Arrays.copyOf(new byte[]{42}, 1));
        c = tl1.A("*");
        d = new PublicSuffixDatabase(new AssetPublicSuffixList());
    }

    public PublicSuffixDatabase(AssetPublicSuffixList assetPublicSuffixList) {
        this.a = assetPublicSuffixList;
    }

    public static List b(String str) {
        List y0 = k4b.y0(str, new char[]{'.'}, 0, 6);
        if (c16.i(sl1.j0(y0), "")) {
            return sl1.Z(y0);
        }
        return y0;
    }

    public final String a(String str) {
        String str2;
        String str3;
        String str4;
        List list;
        List list2;
        int size;
        int size2;
        str.getClass();
        String unicode = IDN.toUnicode(str);
        unicode.getClass();
        List b2 = b(unicode);
        AssetPublicSuffixList assetPublicSuffixList = this.a;
        AtomicBoolean atomicBoolean = assetPublicSuffixList.a;
        if (!atomicBoolean.get() && atomicBoolean.compareAndSet(false, true)) {
            boolean z = false;
            while (true) {
                try {
                    try {
                        assetPublicSuffixList.c();
                        break;
                    } catch (InterruptedIOException unused) {
                        Thread.interrupted();
                        z = true;
                    } catch (IOException e) {
                        assetPublicSuffixList.e = e;
                        if (z) {
                        }
                    }
                } finally {
                    if (z) {
                        Thread.currentThread().interrupt();
                    }
                }
            }
        } else {
            try {
                assetPublicSuffixList.b.await();
            } catch (InterruptedException unused2) {
                Thread.currentThread().interrupt();
            }
        }
        if (assetPublicSuffixList.c != null) {
            int size3 = b2.size();
            e31[] e31VarArr = new e31[size3];
            for (int i = 0; i < size3; i++) {
                e31 e31Var = e31.d;
                e31VarArr[i] = p40.o((String) b2.get(i));
            }
            int i2 = 0;
            while (true) {
                if (i2 < size3) {
                    str2 = Companion.a(assetPublicSuffixList.a(), e31VarArr, i2);
                    if (str2 != null) {
                        break;
                    }
                    i2++;
                } else {
                    str2 = null;
                    break;
                }
            }
            if (size3 > 1) {
                e31[] e31VarArr2 = (e31[]) e31VarArr.clone();
                int length = e31VarArr2.length - 1;
                for (int i3 = 0; i3 < length; i3++) {
                    e31VarArr2[i3] = b;
                    str3 = Companion.a(assetPublicSuffixList.a(), e31VarArr2, i3);
                    if (str3 != null) {
                        break;
                    }
                }
            }
            str3 = null;
            if (str3 != null) {
                int i4 = size3 - 1;
                for (int i5 = 0; i5 < i4; i5++) {
                    e31 e31Var2 = assetPublicSuffixList.d;
                    if (e31Var2 != null) {
                        str4 = Companion.a(e31Var2, e31VarArr, i5);
                        if (str4 != null) {
                            break;
                        }
                    } else {
                        c16.w("exceptionBytes");
                        throw null;
                    }
                }
            }
            str4 = null;
            if (str4 != null) {
                list2 = k4b.y0("!".concat(str4), new char[]{'.'}, 0, 6);
            } else if (str2 == null && str3 == null) {
                list2 = c;
            } else {
                ks3 ks3Var = ks3.a;
                if (str2 != null) {
                    list = k4b.y0(str2, new char[]{'.'}, 0, 6);
                } else {
                    list = ks3Var;
                }
                if (str3 != null) {
                    list2 = k4b.y0(str3, new char[]{'.'}, 0, 6);
                } else {
                    list2 = ks3Var;
                }
                if (list.size() > list2.size()) {
                    list2 = list;
                }
            }
            if (b2.size() == list2.size() && ((String) list2.get(0)).charAt(0) != '!') {
                return null;
            }
            if (((String) list2.get(0)).charAt(0) == '!') {
                size = b2.size();
                size2 = list2.size();
            } else {
                size = b2.size();
                size2 = list2.size() + 1;
            }
            int i6 = size - size2;
            b9a c00Var = new c00(b(str), 1);
            if (i6 >= 0) {
                if (i6 != 0) {
                    if (c00Var instanceof ml3) {
                        c00Var = ((ml3) c00Var).a(i6);
                    } else {
                        c00Var = new jl3(c00Var, i6);
                    }
                }
                return g9a.d0(c00Var, ".");
            }
            p1a.k(hl5.l("Requested element count ", " is less than zero.", i6));
            return null;
        }
        IllegalStateException illegalStateException = new IllegalStateException("Unable to load " + ((Object) assetPublicSuffixList.f) + " resource.");
        illegalStateException.initCause(assetPublicSuffixList.e);
        throw illegalStateException;
    }
}
