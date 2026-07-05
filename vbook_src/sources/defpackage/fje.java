package defpackage;

import android.content.Context;
import java.util.Calendar;
import java.util.Iterator;
import java.util.Locale;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import org.json.JSONObject;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: fje  reason: default package */
/* loaded from: classes.dex */
public final class fje implements exa, k1e {
    public static volatile rm9 E;
    public final /* synthetic */ int a;
    public String b;
    public static final fje c = new fje(0, "TINK", false);
    public static final fje d = new fje(0, "CRUNCHY", false);
    public static final fje e = new fje(0, "NO_PREFIX", false);
    public static final fje f = new fje(1, "TINK", false);
    public static final fje C = new fje(1, "NO_PREFIX", false);
    public static final Object D = new Object();

    public fje(String str, int i) {
        this.a = i;
        switch (i) {
            case 6:
                am8.p(str);
                this.b = str;
                return;
            default:
                str.getClass();
                this.b = str;
                if (str.length() > 0) {
                    return;
                }
                vs.k("Date parser pattern shouldn't be empty.");
                throw null;
        }
    }

    public static void b(yv yvVar, char c2, String str) {
        Object obj;
        if (c2 != '*') {
            if (c2 != 'M') {
                if (c2 != 'Y') {
                    if (c2 != 'd') {
                        if (c2 != 'h') {
                            if (c2 != 'm') {
                                if (c2 != 's') {
                                    if (c2 != 'z') {
                                        for (int i = 0; i < str.length(); i++) {
                                            if (str.charAt(i) != c2) {
                                                vs.k("Check failed.");
                                                return;
                                            }
                                        }
                                        return;
                                    } else if (!str.equals("GMT")) {
                                        vs.k("Check failed.");
                                        return;
                                    } else {
                                        return;
                                    }
                                }
                                yvVar.a = Integer.valueOf(Integer.parseInt(str));
                                return;
                            }
                            yvVar.b = Integer.valueOf(Integer.parseInt(str));
                            return;
                        }
                        yvVar.c = Integer.valueOf(Integer.parseInt(str));
                        return;
                    }
                    yvVar.d = Integer.valueOf(Integer.parseInt(str));
                    return;
                }
                yvVar.f = Integer.valueOf(Integer.parseInt(str));
                return;
            }
            ar7.b.getClass();
            Iterator it = ar7.d.iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    if (((ar7) obj).a.equals(str)) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            ar7 ar7Var = (ar7) obj;
            if (ar7Var != null) {
                yvVar.e = ar7Var;
                return;
            }
            throw new IllegalStateException("Invalid month: ".concat(str).toString());
        }
    }

    @Override // defpackage.exa
    public Iterator a(uu5 uu5Var, CharSequence charSequence) {
        return new cxa(this, uu5Var, charSequence, 1);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, yv] */
    public jv4 c(String str) {
        ?? obj = new Object();
        String str2 = this.b;
        char charAt = str2.charAt(0);
        int i = 0;
        int i2 = 0;
        int i3 = 1;
        while (i3 < str2.length()) {
            try {
                if (str2.charAt(i3) == charAt) {
                    i3++;
                } else {
                    int i4 = (i + i3) - i2;
                    b(obj, charAt, str.substring(i, i4));
                    try {
                        charAt = str2.charAt(i3);
                        i2 = i3;
                        i3++;
                        i = i4;
                    } catch (Throwable unused) {
                        i = i4;
                        throw new IllegalStateException(s21.p(s21.s("Failed to parse date string: \"", str, "\" at index ", i, ". Pattern: \""), str2, '\"'));
                    }
                }
            } catch (Throwable unused2) {
            }
        }
        if (i < str.length()) {
            b(obj, charAt, str.substring(i));
        }
        Integer num = (Integer) obj.a;
        num.getClass();
        int intValue = num.intValue();
        Integer num2 = (Integer) obj.b;
        num2.getClass();
        int intValue2 = num2.intValue();
        Integer num3 = (Integer) obj.c;
        num3.getClass();
        int intValue3 = num3.intValue();
        Integer num4 = (Integer) obj.d;
        num4.getClass();
        int intValue4 = num4.intValue();
        ar7 ar7Var = (ar7) obj.e;
        if (ar7Var != null) {
            Integer num5 = (Integer) obj.f;
            num5.getClass();
            int intValue5 = num5.intValue();
            Calendar calendar = Calendar.getInstance(pi2.a, Locale.ROOT);
            calendar.getClass();
            calendar.set(1, intValue5);
            calendar.set(2, ar7Var.ordinal());
            calendar.set(5, intValue4);
            calendar.set(11, intValue3);
            calendar.set(12, intValue2);
            calendar.set(13, intValue);
            calendar.set(14, 0);
            int i5 = calendar.get(16) + calendar.get(15);
            int i6 = calendar.get(13);
            int i7 = calendar.get(12);
            int i8 = calendar.get(11);
            fid.a.getClass();
            fid fidVar = (fid) fid.c.get((calendar.get(7) + 5) % 7);
            int i9 = calendar.get(5);
            int i10 = calendar.get(6);
            int i11 = calendar.get(2);
            ar7.b.getClass();
            return new jv4(i6, i7, i8, fidVar, i9, i10, (ar7) ar7.d.get(i11), calendar.get(1), calendar.getTimeInMillis() + i5);
        }
        c16.w("month");
        throw null;
    }

    public byte[] d(int i, byte[] bArr, byte[] bArr2) {
        kkf kkfVar = kkf.c;
        String str = this.b;
        Mac mac = (Mac) kkfVar.a.zza(str);
        if (i <= mac.getMacLength() * 255) {
            byte[] bArr3 = new byte[i];
            mac.init(new SecretKeySpec(bArr, str));
            byte[] bArr4 = new byte[0];
            int i2 = 1;
            int i3 = 0;
            while (true) {
                mac.update(bArr4);
                mac.update(bArr2);
                mac.update((byte) i2);
                bArr4 = mac.doFinal();
                if (bArr4.length + i3 < i) {
                    System.arraycopy(bArr4, 0, bArr3, i3, bArr4.length);
                    i3 += bArr4.length;
                    i2++;
                } else {
                    System.arraycopy(bArr4, 0, bArr3, i3, i - i3);
                    return bArr3;
                }
            }
        } else {
            hfd.j("size too large");
            return null;
        }
    }

    public byte[] e(byte[] bArr, byte[] bArr2) {
        kkf kkfVar = kkf.c;
        String str = this.b;
        Mac mac = (Mac) kkfVar.a.zza(str);
        if (bArr2 != null && bArr2.length != 0) {
            mac.init(new SecretKeySpec(bArr2, str));
        } else {
            mac.init(new SecretKeySpec(new byte[mac.getMacLength()], str));
        }
        return mac.doFinal(bArr);
    }

    public String toString() {
        switch (this.a) {
            case 0:
                return this.b;
            case 1:
                return this.b;
            default:
                return super.toString();
        }
    }

    @Override // defpackage.k1e
    public String zza() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("idToken", this.b);
        return jSONObject.toString();
    }

    public /* synthetic */ fje(int i, String str, boolean z) {
        this.a = i;
        this.b = str;
    }

    public fje(Context context, n6f n6fVar) {
        String t;
        this.a = 2;
        if (n6fVar.u()) {
            t = tze.b(context, n6fVar.t());
        } else {
            t = n6fVar.t();
        }
        this.b = t;
    }

    public /* synthetic */ fje() {
        this.a = 4;
    }
}
