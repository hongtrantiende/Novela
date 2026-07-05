package defpackage;

import android.app.Activity;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.net.Uri;
import android.util.Log;
import com.vbook.android.R;
import j$.time.LocalDateTime;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: tn3  reason: default package */
/* loaded from: classes.dex */
public class tn3 implements dj1, yt0, vh3, jc6, c82, x68, w9a, b8e, y21, y22, an8, vs3, na4, yj1, bed {
    public final /* synthetic */ int a;
    public static final tn3 b = new tn3(1);
    public static final tn3 c = new tn3(2);
    public static final tn3 d = new tn3(3);
    public static final tn3 e = new tn3(4);
    public static final tn3 f = new tn3(5);
    public static final tn3 C = new tn3(6);
    public static final /* synthetic */ tn3 D = new tn3(7);
    public static final tn3 E = new tn3(8);
    public static final /* synthetic */ tn3 F = new tn3(9);
    public static final tn3 G = new tn3(10);
    public static final tn3 H = new tn3(11);
    public static final saa I = new saa(null, null, null, null, null);
    public static final /* synthetic */ tn3 J = new tn3(12);
    public static final nsb K = new Object();
    public static final /* synthetic */ tn3 L = new tn3(13);
    public static final tn3 M = new tn3(14);

    public /* synthetic */ tn3(int i) {
        this.a = i;
    }

    public static String r(long j) {
        if (j < 0) {
            j = 0;
        }
        long j2 = j / 3600;
        long j3 = (j / 60) % 60;
        long j4 = j % 60;
        if (j2 <= 0) {
            return rqe.h("%02d:%02d", Long.valueOf(j3), Long.valueOf(j4));
        }
        if (j2 < 99) {
            return rqe.h("%02d:%02d:%02d", Long.valueOf(j2), Long.valueOf(j3), Long.valueOf(j4));
        }
        return rqe.h("%d:%02d:%02d", Long.valueOf(j2), Long.valueOf(j3), Long.valueOf(j4));
    }

    public static int s(xt6 xt6Var) {
        nt6 nt6Var = new nt6(xt6Var.a.getYear(), 1, 1);
        zj2 a = nt6Var.a();
        a.getClass();
        return (int) ((((xt6Var.a().a.toEpochDay() - nt6Var.a.toEpochDay()) + (a.ordinal() + 1)) - 1) / 7);
    }

    public static Object t(long j, aab aabVar) {
        zx5 zx5Var = zx5.c;
        zx5 k = bze.k(j);
        zx5 k2 = by5.a.k();
        int i = w9c.b;
        xt6 x = c16.x(k2, b16.p());
        xt6 x2 = c16.x(k, b16.p());
        LocalDateTime localDateTime = x.a;
        int dayOfYear = localDateTime.getDayOfYear();
        LocalDateTime localDateTime2 = x2.a;
        if (dayOfYear == localDateTime2.getDayOfYear() && localDateTime.getYear() == localDateTime2.getYear()) {
            return yqe.u((y3b) o3b.U.getValue(), aabVar);
        }
        if (s(x) == s(x2) && localDateTime.getYear() == localDateTime2.getYear()) {
            return zj1.f(j, "EEE");
        }
        return zj1.f(j, "E, dd MMM");
    }

    @Override // defpackage.y21
    public byte[] a(byte[] bArr, int i, int i2) {
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, i, bArr2, 0, i2);
        return bArr2;
    }

    @Override // defpackage.w9a
    public /* bridge */ /* synthetic */ Object b() {
        return I;
    }

    @Override // defpackage.w9a
    public void c(Object obj, kj9 kj9Var) {
        ((FileOutputStream) kj9Var.b).write(r4b.H(r36.d.b(saa.Companion.serializer(), (saa) obj)));
    }

    @Override // defpackage.yt0
    public Rect d(Activity activity) {
        Configuration configuration = activity.getResources().getConfiguration();
        try {
            Field declaredField = Configuration.class.getDeclaredField("windowConfiguration");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(configuration);
            Object invoke = obj.getClass().getDeclaredMethod("getBounds", null).invoke(obj, null);
            invoke.getClass();
            return new Rect((Rect) invoke);
        } catch (Exception e2) {
            if (!(e2 instanceof NoSuchFieldException) && !(e2 instanceof NoSuchMethodException) && !(e2 instanceof IllegalAccessException) && !(e2 instanceof InvocationTargetException)) {
                throw e2;
            }
            yt0.h.getClass();
            Log.w(xt0.b, e2);
            return zj1.c.d(activity);
        }
    }

    @Override // defpackage.y22
    public long e(long j, long j2) {
        float a = mna.a(j2) / mna.a(j);
        return mz9.a(a, a);
    }

    @Override // defpackage.vh3
    public Object f(d19 d19Var, kj3 kj3Var, lj3 lj3Var, lj3 lj3Var2, lu4 lu4Var, zsa zsaVar) {
        float f2 = mi3.a;
        Object h = yae.h(d19Var, new gi3(kj3Var, lj3Var, lj3Var2, lu4Var, null), zsaVar);
        pvc pvcVar = pvc.a;
        n82 n82Var = n82.a;
        if (h != n82Var) {
            h = pvcVar;
        }
        if (h == n82Var) {
            return h;
        }
        return pvcVar;
    }

    @Override // defpackage.vs3
    public f31 g(f31 f31Var, d82 d82Var) {
        throw null;
    }

    @Override // defpackage.k99
    public Object get() {
        return r2d.a;
    }

    @Override // defpackage.w9a
    public Object h(FileInputStream fileInputStream) {
        try {
            q36 q36Var = r36.d;
            String F2 = r4b.F(gae.n(fileInputStream));
            q36Var.getClass();
            return (saa) q36Var.a(saa.Companion.serializer(), F2);
        } catch (Exception e2) {
            throw new IOException("Cannot parse session configs", e2);
        }
    }

    @Override // defpackage.jc6
    public Object i(p15 p15Var, m42 m42Var) {
        long j = p15Var.u;
        Bitmap createBitmap = Bitmap.createBitmap((int) (j >> 32), (int) (j & 4294967295L), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Canvas canvas2 = tf.a;
        sf sfVar = new sf();
        sfVar.a = canvas;
        p15Var.c(sfVar, null);
        return createBitmap;
    }

    @Override // defpackage.yj1
    public zx5 k() {
        zx5 zx5Var = zx5.c;
        return bze.k(System.currentTimeMillis());
    }

    @Override // defpackage.an8
    public Object l(Uri uri, lg2 lg2Var) {
        return Long.valueOf(a2d.T(new BufferedReader(new InputStreamReader(lg2Var)).readLine()));
    }

    @Override // defpackage.x68
    public String m() {
        return "expected an Int value";
    }

    @Override // defpackage.bed
    public int n() {
        return R.id.view_tree_navigation_event_dispatcher_owner;
    }

    @Override // defpackage.vs3
    public s11 o(s11 s11Var, d82 d82Var) {
        throw null;
    }

    @Override // defpackage.vs3
    public s11 p(s11 s11Var, d82 d82Var) {
        throw null;
    }

    @Override // defpackage.dj1
    public void q(re5 re5Var, aab aabVar) {
        switch (this.a) {
            case 1:
                re5Var.getClass();
                re5Var.C.g(ah5.i, new x8((lu4) aabVar, null, 0));
                return;
            default:
                re5Var.getClass();
                lie lieVar = new lie(3, "AfterState", false);
                ah5 ah5Var = re5Var.C;
                ah5Var.f(ah5.h, lieVar);
                ah5Var.g(lieVar, new w8((mu4) aabVar, null, 5));
                return;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x00cf, code lost:
        if (r11 == r6) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0105, code lost:
        if (r11 == r6) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x013d, code lost:
        if (r11 == r6) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0173, code lost:
        if (r11 == r6) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0229, code lost:
        if (r11 == r6) goto L41;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object u(long r12, defpackage.n42 r14) {
        /*
            Method dump skipped, instructions count: 598
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tn3.u(long, n42):java.lang.Object");
    }

    @Override // defpackage.b8e
    public n8e zza(Class cls) {
        if (m7e.class.isAssignableFrom(cls)) {
            try {
                return (n8e) m7e.f(cls.asSubclass(m7e.class)).d(3);
            } catch (Exception e2) {
                cp8.p("Unable to get message info for ".concat(cls.getName()), e2);
                return null;
            }
        }
        vs.m("Unsupported message type: ".concat(cls.getName()));
        return null;
    }

    @Override // defpackage.b8e
    public boolean zzb(Class cls) {
        return m7e.class.isAssignableFrom(cls);
    }
}
