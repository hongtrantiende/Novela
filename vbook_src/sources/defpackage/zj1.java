package defpackage;

import android.app.Activity;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import android.view.Display;
import android.view.DisplayCutout;
import androidx.preference.ListPreference;
import androidx.preference.Preference;
import com.vbook.android.R;
import j$.time.Instant;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: zj1  reason: default package */
/* loaded from: classes.dex */
public final class zj1 implements dj1, yt0, hu1, c82, r6b, kra, x21, y22, na4, yj1, u39 {
    public static zj1 I;
    public final /* synthetic */ int a;
    public static final zj1 b = new zj1(1);
    public static final zj1 c = new zj1(2);
    public static final zj1 d = new zj1(4);
    public static final zj1 e = new zj1(5);
    public static final zj1 f = new zj1(6);
    public static final /* synthetic */ zj1 C = new zj1(7);
    public static final zj1 D = new zj1(8);
    public static final zj1 E = new zj1(10);
    public static final zj1 F = new zj1(11);
    public static final zj1 G = new zj1(12);
    public static final zj1 H = new zj1(13);

    public zj1() {
        this.a = 23;
        if (Build.VERSION.SDK_INT >= 35) {
        }
    }

    public static final byte[] b(short[] sArr, int i) {
        b45 b45Var = v.v;
        int length = sArr.length * 2;
        byte[] bArr = new byte[length + 44];
        bArr[0] = 82;
        bArr[1] = 73;
        bArr[2] = 70;
        bArr[3] = 70;
        p(bArr, 4, length + 36);
        bArr[8] = 87;
        bArr[9] = 65;
        bArr[10] = 86;
        bArr[11] = 69;
        bArr[12] = 102;
        bArr[13] = 109;
        bArr[14] = 116;
        bArr[15] = 32;
        p(bArr, 16, 16);
        r(bArr, 20, 1);
        r(bArr, 22, 1);
        p(bArr, 24, i);
        p(bArr, 28, i * 2);
        r(bArr, 32, 2);
        r(bArr, 34, 16);
        bArr[36] = 100;
        bArr[37] = 97;
        bArr[38] = 116;
        bArr[39] = 97;
        p(bArr, 40, length);
        int length2 = sArr.length;
        for (int i2 = 0; i2 < length2; i2++) {
            short s = sArr[i2];
            int i3 = i2 * 2;
            bArr[i3 + 44] = (byte) (s & 255);
            bArr[i3 + 45] = (byte) ((s >> 8) & 255);
        }
        return bArr;
    }

    public static String f(long j, String str) {
        Locale a = pv6.b().a(0);
        if (a == null) {
            a = Locale.getDefault();
        }
        a.getClass();
        zx5 zx5Var = zx5.c;
        zx5 k = bze.k(j);
        k.getClass();
        try {
            String format = new SimpleDateFormat(str, a).format(new Date(k.b()));
            format.getClass();
            return format;
        } catch (Exception unused) {
            return "";
        }
    }

    public static void l(int i, int i2, int i3, int[] iArr) {
        iArr.getClass();
        if (i != -2) {
            if (i == -1) {
                while (i2 <= i3) {
                    int i4 = iArr[i2];
                    iArr[i2] = ((i4 >> 10) & 31) | ((i4 & 31) << 10) | (((i4 >> 5) & 31) << 5);
                    i2++;
                }
                return;
            }
            return;
        }
        while (i2 <= i3) {
            int i5 = iArr[i2];
            iArr[i2] = (i5 & 31) | (((i5 >> 5) & 31) << 10) | (((i5 >> 10) & 31) << 5);
            i2++;
        }
    }

    public static int m(int i, int i2, int i3) {
        int i4;
        if (i3 > i2) {
            i4 = i << (i3 - i2);
        } else {
            i4 = i >> (i2 - i3);
        }
        return i4 & ((1 << i3) - 1);
    }

    public static long n() {
        return by5.a.k().b();
    }

    public static pv7 o(mj9 mj9Var) {
        int i;
        byte[] bArr;
        try {
            s49 p = s49.p(new ln0(mj9Var, 3));
            pv7 pv7Var = new pv7(false);
            f49[] f49VarArr = (f49[]) Arrays.copyOf(new f49[0], 0);
            pv7Var.b();
            if (f49VarArr.length <= 0) {
                Map n = p.n();
                n.getClass();
                for (Map.Entry entry : n.entrySet()) {
                    String str = (String) entry.getKey();
                    w49 w49Var = (w49) entry.getValue();
                    str.getClass();
                    w49Var.getClass();
                    int D2 = w49Var.D();
                    if (D2 == 0) {
                        i = -1;
                    } else {
                        i = x49.a[a82.C(D2)];
                    }
                    switch (i) {
                        case -1:
                            throw new IOException("Value case is null.", null);
                        case 0:
                        default:
                            xk5.o();
                            return null;
                        case 1:
                            pv7Var.f(new e49(str), Boolean.valueOf(w49Var.u()));
                            break;
                        case 2:
                            pv7Var.f(new e49(str), Float.valueOf(w49Var.y()));
                            break;
                        case 3:
                            pv7Var.f(new e49(str), Double.valueOf(w49Var.x()));
                            break;
                        case 4:
                            pv7Var.f(new e49(str), Integer.valueOf(w49Var.z()));
                            break;
                        case 5:
                            pv7Var.f(new e49(str), Long.valueOf(w49Var.A()));
                            break;
                        case 6:
                            pv7Var.f(new e49(str), w49Var.B());
                            break;
                        case 7:
                            e49 e49Var = new e49(str);
                            tz5 o = w49Var.C().o();
                            o.getClass();
                            pv7Var.f(e49Var, sl1.H0(o));
                            break;
                        case 8:
                            e49 e49Var2 = new e49(str);
                            c31 v = w49Var.v();
                            int size = v.size();
                            if (size == 0) {
                                bArr = wz5.b;
                            } else {
                                byte[] bArr2 = new byte[size];
                                v.d(bArr2, size);
                                bArr = bArr2;
                            }
                            pv7Var.f(e49Var2, bArr);
                            break;
                        case 9:
                            throw new IOException("Value not set.", null);
                    }
                }
                return pv7Var.h();
            }
            f49 f49Var = f49VarArr[0];
            throw null;
        } catch (q16 e2) {
            throw new IOException("Unable to parse preferences proto.", e2);
        }
    }

    public static final void p(byte[] bArr, int i, int i2) {
        bArr[i] = (byte) (i2 & 255);
        bArr[i + 1] = (byte) ((i2 >> 8) & 255);
        bArr[i + 2] = (byte) ((i2 >> 16) & 255);
        bArr[i + 3] = (byte) ((i2 >> 24) & 255);
    }

    public static final void r(byte[] bArr, int i, int i2) {
        bArr[i] = (byte) (i2 & 255);
        bArr[i + 1] = 0;
    }

    public static void s(Object obj, lj9 lj9Var) {
        qw4 a;
        Map a2 = ((pv7) obj).a();
        q49 o = s49.o();
        for (Map.Entry entry : a2.entrySet()) {
            Object value = entry.getValue();
            String str = ((e49) entry.getKey()).a;
            if (value instanceof Boolean) {
                v49 E2 = w49.E();
                boolean booleanValue = ((Boolean) value).booleanValue();
                E2.c();
                w49.r((w49) E2.b, booleanValue);
                a = E2.a();
            } else if (value instanceof Float) {
                v49 E3 = w49.E();
                float floatValue = ((Number) value).floatValue();
                E3.c();
                w49.s((w49) E3.b, floatValue);
                a = E3.a();
            } else if (value instanceof Double) {
                v49 E4 = w49.E();
                double doubleValue = ((Number) value).doubleValue();
                E4.c();
                w49.p((w49) E4.b, doubleValue);
                a = E4.a();
            } else if (value instanceof Integer) {
                v49 E5 = w49.E();
                int intValue = ((Number) value).intValue();
                E5.c();
                w49.t((w49) E5.b, intValue);
                a = E5.a();
            } else if (value instanceof Long) {
                v49 E6 = w49.E();
                long longValue = ((Number) value).longValue();
                E6.c();
                w49.m((w49) E6.b, longValue);
                a = E6.a();
            } else if (value instanceof String) {
                v49 E7 = w49.E();
                E7.c();
                w49.n((w49) E7.b, (String) value);
                a = E7.a();
            } else if (value instanceof Set) {
                v49 E8 = w49.E();
                t49 p = u49.p();
                p.c();
                u49.m((u49) p.b, (Set) value);
                E8.c();
                w49.o((w49) E8.b, (u49) p.a());
                a = E8.a();
            } else if (value instanceof byte[]) {
                v49 E9 = w49.E();
                byte[] bArr = (byte[]) value;
                c31 c2 = c31.c(bArr, 0, bArr.length);
                E9.c();
                w49.q((w49) E9.b, c2);
                a = E9.a();
            } else {
                vs.k("PreferencesSerializer does not support type: ".concat(value.getClass().getName()));
                return;
            }
            o.getClass();
            str.getClass();
            o.c();
            s49.m((s49) o.b).put(str, (w49) a);
        }
        ((s49) o.a()).c(new kj9(lj9Var));
        lj9Var.flush();
    }

    public static /* bridge */ x2e t(Object obj) {
        o0e o0eVar = (o0e) obj;
        x2e x2eVar = o0eVar.zzc;
        if (x2eVar == x2e.f) {
            x2e a = x2e.a();
            o0eVar.zzc = a;
            return a;
        }
        return x2eVar;
    }

    public static boolean u(int i, vh1 vh1Var, Object obj) {
        dcc dccVar = (dcc) vh1Var.e;
        int i2 = vh1Var.b;
        int i3 = i2 >>> 3;
        int i4 = i2 & 7;
        if (i4 != 0) {
            if (i4 != 1) {
                if (i4 != 2) {
                    if (i4 != 3) {
                        if (i4 != 4) {
                            if (i4 == 5) {
                                vh1Var.F0(5);
                                ((x2e) obj).d(5 | (i3 << 3), Integer.valueOf(dccVar.A()));
                                return true;
                            }
                            hfd.c();
                            return false;
                        } else if (i != 0) {
                            return false;
                        } else {
                            hfd.s("Protocol message end-group tag did not match expected tag.");
                            return false;
                        }
                    }
                    x2e a = x2e.a();
                    int i5 = i3 << 3;
                    int i6 = i + 1;
                    if (i6 < 100) {
                        while (vh1Var.Q0() != Integer.MAX_VALUE && u(i6, vh1Var, a)) {
                        }
                        if ((i5 | 4) == vh1Var.b) {
                            if (a.e) {
                                a.e = false;
                            }
                            ((x2e) obj).d(i5 | 3, a);
                            return true;
                        }
                        hfd.s("Protocol message end-group tag did not match expected tag.");
                        return false;
                    }
                    hfd.s("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
                    return false;
                }
                ((x2e) obj).d((i3 << 3) | 2, vh1Var.m1());
                return true;
            }
            vh1Var.F0(1);
            ((x2e) obj).d((i3 << 3) | 1, Long.valueOf(dccVar.z()));
            return true;
        }
        vh1Var.F0(0);
        ((x2e) obj).d(i3 << 3, Long.valueOf(dccVar.x()));
        return true;
    }

    @Override // defpackage.x21
    public byte[] a(byte[] bArr, int i, int i2) {
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, i, bArr2, 0, i2);
        return bArr2;
    }

    @Override // defpackage.r6b
    public void c(q6b q6bVar) {
        q6bVar.clear();
    }

    @Override // defpackage.yt0
    public Rect d(Activity activity) {
        DisplayCutout b2;
        int i;
        Rect rect = new Rect();
        Configuration configuration = activity.getResources().getConfiguration();
        try {
            Field declaredField = Configuration.class.getDeclaredField("windowConfiguration");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(configuration);
            if (activity.isInMultiWindowMode()) {
                Object invoke = obj.getClass().getDeclaredMethod("getBounds", null).invoke(obj, null);
                invoke.getClass();
                rect.set((Rect) invoke);
            } else {
                Object invoke2 = obj.getClass().getDeclaredMethod("getAppBounds", null).invoke(obj, null);
                invoke2.getClass();
                rect.set((Rect) invoke2);
            }
        } catch (Exception e2) {
            if (!(e2 instanceof NoSuchFieldException) && !(e2 instanceof NoSuchMethodException) && !(e2 instanceof IllegalAccessException) && !(e2 instanceof InvocationTargetException)) {
                throw e2;
            }
            yt0.h.getClass();
            Log.w(xt0.b, e2);
            activity.getWindowManager().getDefaultDisplay().getRectSize(rect);
        }
        Display defaultDisplay = activity.getWindowManager().getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getRealSize(point);
        if (!activity.isInMultiWindowMode()) {
            Resources resources = activity.getResources();
            int identifier = resources.getIdentifier("navigation_bar_height", "dimen", "android");
            if (identifier > 0) {
                i = resources.getDimensionPixelSize(identifier);
            } else {
                i = 0;
            }
            int i2 = rect.bottom + i;
            if (i2 == point.y) {
                rect.bottom = i2;
            } else {
                int i3 = rect.right + i;
                if (i3 == point.x) {
                    rect.right = i3;
                } else if (rect.left == i) {
                    rect.left = 0;
                }
            }
        }
        if ((rect.width() < point.x || rect.height() < point.y) && !activity.isInMultiWindowMode() && (b2 = ru.b(defaultDisplay)) != null) {
            if (rect.left == ru.G(b2)) {
                rect.left = 0;
            }
            if (point.x - rect.right == ru.H(b2)) {
                rect.right = ru.H(b2) + rect.right;
            }
            if (rect.top == ru.I(b2)) {
                rect.top = 0;
            }
            if (point.y - rect.bottom == ru.F(b2)) {
                rect.bottom = ru.F(b2) + rect.bottom;
            }
        }
        return rect;
    }

    @Override // defpackage.y22
    public long e(long j, long j2) {
        return mz9.a(mna.b(j2) / mna.b(j), mna.a(j2) / mna.a(j));
    }

    @Override // defpackage.u39
    public CharSequence g(Preference preference) {
        ListPreference listPreference = (ListPreference) preference;
        if (!TextUtils.isEmpty(null)) {
            return null;
        }
        return listPreference.a.getString(R.string.not_set);
    }

    @Override // defpackage.k99
    public Object get() {
        return t9c.a;
    }

    @Override // defpackage.r6b
    public boolean h(Object obj, Object obj2) {
        return false;
    }

    @Override // defpackage.kra
    public boolean i(Object obj, Object obj2) {
        return c16.i(obj, obj2);
    }

    @Override // defpackage.hu1
    public Object j(yv yvVar) {
        Object h = yvVar.h(new mf9(tuc.class, Executor.class));
        h.getClass();
        return zj0.e((Executor) h);
    }

    @Override // defpackage.yj1
    public zx5 k() {
        Instant now = Instant.now();
        now.getClass();
        return eze.t(now);
    }

    @Override // defpackage.dj1
    public void q(re5 re5Var, aab aabVar) {
        switch (this.a) {
            case 1:
                re5Var.getClass();
                re5Var.C.g(ah5.i, new w8((mu4) aabVar, null, 0));
                return;
            case 10:
                re5Var.getClass();
                re5Var.d.g(ah5.k, new me((nu4) aabVar, (m42) null, 7));
                return;
            default:
                re5Var.getClass();
                re5Var.f.g(ah5.v, new w8((mu4) aabVar, null, 7));
                return;
        }
    }

    public String toString() {
        switch (this.a) {
            case 12:
                return "StructuralEqualityPolicy";
            default:
                return super.toString();
        }
    }

    public /* synthetic */ zj1(int i) {
        this.a = i;
    }
}
