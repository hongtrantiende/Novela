package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.opengl.Matrix;
import android.os.Bundle;
import android.os.Looper;
import android.util.SparseArray;
import com.google.firebase.messaging.FirebaseMessaging;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicMarkableReference;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.ReentrantLock;
import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: o40  reason: default package */
/* loaded from: classes.dex */
public final class o40 implements t94 {
    public boolean a;
    public final Object b;
    public Object c;
    public Object d;

    public o40(int i, boolean z) {
        switch (i) {
            case 4:
                this.b = new Object();
                this.c = new ArrayList();
                this.d = new ArrayList();
                this.a = true;
                return;
            case 9:
                this.b = new Object();
                this.c = new ArrayDeque();
                this.d = new AtomicReference();
                return;
            default:
                this.b = new float[16];
                this.c = new float[16];
                this.d = new cw(6, (byte) 0);
                return;
        }
    }

    public static qv5 a(o40 o40Var, ArrayList arrayList, int i) {
        boolean z;
        boolean z2;
        boolean z3;
        iyb a;
        Character o0;
        if ((i & 4) != 0) {
            z = false;
        } else {
            z = true;
        }
        if ((i & 8) != 0) {
            z2 = false;
        } else {
            z2 = true;
        }
        qv5 d = o40Var.d(arrayList);
        if (z && (o0 = k4b.o0(d.a)) != null && o0.charValue() == '\n') {
            d = tl1.I(d, 0, d.a.length() - 1);
        }
        String str = d.a;
        int length = str.length();
        int i2 = 0;
        while (i2 < length && nqe.y(str.charAt(i2))) {
            i2++;
        }
        while (length > i2 && nqe.y(str.charAt(length - 1))) {
            length--;
        }
        qv5 I = tl1.I(d, i2, length);
        if (z2) {
            String str2 = I.a;
            int length2 = str2.length();
            int i3 = 0;
            boolean z4 = false;
            while (i3 < length2) {
                char charAt = str2.charAt(i3);
                if (charAt != ' ' && charAt != '\t') {
                    z3 = false;
                } else {
                    z3 = true;
                }
                if ((z3 && z4) || charAt == '\t') {
                    int[] iArr = new int[str2.length() + 1];
                    StringBuilder sb = new StringBuilder(str2.length());
                    int length3 = str2.length();
                    boolean z5 = false;
                    for (int i4 = 0; i4 < length3; i4++) {
                        iArr[i4] = sb.length();
                        char charAt2 = str2.charAt(i4);
                        if (charAt2 != '\t' && charAt2 != ' ') {
                            sb.append(charAt2);
                            z5 = false;
                        } else if (!z5) {
                            sb.append(' ');
                            z5 = true;
                        }
                    }
                    iArr[str2.length()] = sb.length();
                    List<iyb> list = I.b;
                    ArrayList arrayList2 = new ArrayList();
                    for (iyb iybVar : list) {
                        int i5 = iArr[dce.n(iybVar.a, 0, str2.length())];
                        int i6 = iArr[dce.n(iybVar.b, 0, str2.length())];
                        if (i5 >= i6) {
                            a = null;
                        } else {
                            a = iyb.a(iybVar, i5, i6);
                        }
                        if (a != null) {
                            arrayList2.add(a);
                        }
                    }
                    return new qv5(sb.toString(), arrayList2);
                }
                i3++;
                z4 = z3;
            }
        }
        return I;
    }

    public static void c(float[] fArr, float[] fArr2) {
        Matrix.setIdentityM(fArr, 0);
        float f = fArr2[10];
        float f2 = fArr2[8];
        float sqrt = (float) Math.sqrt((f2 * f2) + (f * f));
        float f3 = fArr2[10] / sqrt;
        fArr[0] = f3;
        float f4 = fArr2[8];
        fArr[2] = f4 / sqrt;
        fArr[8] = (-f4) / sqrt;
        fArr[10] = f3;
    }

    public void b(boolean z) {
        ra3 ra3Var = (ra3) this.d;
        synchronized (ra3Var.D) {
            try {
                if (!this.a) {
                    if (c16.i(((oa3) this.b).g, this)) {
                        ra3.o(ra3Var, this, z);
                    }
                    this.a = true;
                } else {
                    throw new IllegalStateException("editor is closed");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public qv5 d(List list) {
        list.getClass();
        return ((zg4) this.b).F(((ec5) this.c).a, list);
    }

    public hn8 e(int i) {
        hn8 hn8Var;
        ra3 ra3Var = (ra3) this.d;
        synchronized (ra3Var.D) {
            if (!this.a) {
                ((boolean[]) this.c)[i] = true;
                Object obj = ((oa3) this.b).d.get(i);
                yf2.q(ra3Var.M, (hn8) obj);
                hn8Var = (hn8) obj;
            } else {
                throw new IllegalStateException("editor is closed");
            }
        }
        return hn8Var;
    }

    public synchronized void f() {
        try {
            if (this.a) {
                return;
            }
            Boolean h = h();
            this.c = h;
            if (h == null) {
                fb4 fb4Var = new fb4(11);
                hx3 hx3Var = (hx3) ((r7b) this.b);
                hx3Var.a(hx3Var.c, fb4Var);
            }
            this.a = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized boolean g() {
        boolean j;
        try {
            f();
            Boolean bool = (Boolean) this.c;
            if (bool != null) {
                j = bool.booleanValue();
            } else {
                j = ((FirebaseMessaging) this.d).a.j();
            }
        } catch (Throwable th) {
            throw th;
        }
        return j;
    }

    public Boolean h() {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        qf4 qf4Var = ((FirebaseMessaging) this.d).a;
        qf4Var.a();
        Context context = qf4Var.a;
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.firebase.messaging", 0);
        if (sharedPreferences.contains("auto_init")) {
            return Boolean.valueOf(sharedPreferences.getBoolean("auto_init", false));
        }
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null && (applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), Token.CASE)) != null && (bundle = applicationInfo.metaData) != null && bundle.containsKey("firebase_messaging_auto_init_enabled")) {
                return Boolean.valueOf(applicationInfo.metaData.getBoolean("firebase_messaging_auto_init_enabled"));
            }
            return null;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    public void i() {
        if (!this.a) {
            return;
        }
        ((ggb) this.d).d(new x0(this, 4));
        this.a = false;
    }

    public void j(Runnable runnable, Executor executor) {
        synchronized (this.b) {
            try {
                if (this.a) {
                    ((ArrayDeque) this.c).add(new udf(runnable, executor));
                    return;
                }
                this.a = true;
                o(runnable, executor);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public String k() {
        if (!this.a) {
            this.a = true;
            this.c = ((dre) this.d).b0().getString((String) this.b, null);
        }
        return (String) this.c;
    }

    public void l(String str) {
        SharedPreferences.Editor edit = ((dre) this.d).b0().edit();
        edit.putString((String) this.b, str);
        edit.apply();
        this.c = str;
    }

    @Override // defpackage.t94
    public void m() {
        SparseArray sparseArray = (SparseArray) this.d;
        ((t94) this.b).m();
        if (this.a) {
            for (int i = 0; i < sparseArray.size(); i++) {
                ((q8b) sparseArray.valueAt(i)).i = true;
            }
        }
    }

    public void n() {
        synchronized (this.b) {
            try {
                if (((ArrayDeque) this.c).isEmpty()) {
                    this.a = false;
                    return;
                }
                udf udfVar = (udf) ((ArrayDeque) this.c).remove();
                o(udfVar.b, udfVar.a);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void o(Runnable runnable, Executor executor) {
        try {
            executor.execute(new w1f(this, false, runnable, 8));
        } catch (RejectedExecutionException unused) {
            n();
        }
    }

    @Override // defpackage.t94
    public fjc s(int i, int i2) {
        SparseArray sparseArray = (SparseArray) this.d;
        t94 t94Var = (t94) this.b;
        if (i2 != 3 && i2 != 5) {
            this.a = true;
        }
        if (i2 != 3) {
            return t94Var.s(i, i2);
        }
        q8b q8bVar = (q8b) sparseArray.get(i);
        if (q8bVar != null) {
            return q8bVar;
        }
        q8b q8bVar2 = new q8b(t94Var.s(i, i2), (m8b) this.c);
        sparseArray.put(i, q8bVar2);
        return q8bVar2;
    }

    @Override // defpackage.t94
    public void v(m4a m4aVar) {
        ((t94) this.b).v(m4aVar);
    }

    public o40(dre dreVar, String str) {
        this.d = dreVar;
        am8.p(str);
        this.b = str;
    }

    public o40(vz0 vz0Var, k32 k32Var, mb4[] mb4VarArr, boolean z) {
        this.d = vz0Var;
        this.b = k32Var;
        this.c = mb4VarArr;
        this.a = z;
    }

    public o40(t94 t94Var, m8b m8bVar) {
        this.b = t94Var;
        this.c = m8bVar;
        this.d = new SparseArray();
    }

    public o40(Context context, Looper looper, Looper looper2, c04 c04Var, xfb xfbVar) {
        this.b = context.getApplicationContext();
        this.d = xfbVar.a(looper, null);
        this.c = new n40(this, xfbVar.a(looper2, null), c04Var);
    }

    public o40(zg4 zg4Var, ec5 ec5Var, boolean z, String str) {
        this.b = zg4Var;
        this.c = ec5Var;
        this.a = z;
        this.d = str;
    }

    public o40(oe4 oe4Var, boolean z) {
        this.d = oe4Var;
        this.c = new AtomicReference(null);
        this.a = z;
        this.b = new AtomicMarkableReference(new k96(z ? 8192 : 1024), false);
    }

    public o40(sh6 sh6Var, o6b o6bVar, a59 a59Var) {
        this.b = sh6Var;
        this.c = o6bVar;
        this.d = a59Var;
        this.a = true;
    }

    public o40(int i) {
        this.b = new ReentrantLock();
        this.c = new long[i];
        this.d = new boolean[i];
    }

    public o40(ra3 ra3Var, oa3 oa3Var) {
        this.d = ra3Var;
        this.b = oa3Var;
        this.c = new boolean[2];
    }

    public o40(FirebaseMessaging firebaseMessaging, r7b r7bVar) {
        this.d = firebaseMessaging;
        this.b = r7bVar;
    }
}
