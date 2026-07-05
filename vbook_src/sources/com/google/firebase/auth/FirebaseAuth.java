package com.google.firebase.auth;

import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.android.recaptcha.RecaptchaAction;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes.dex */
public class FirebaseAuth implements xz5 {
    public final qf4 a;
    public final CopyOnWriteArrayList b;
    public final CopyOnWriteArrayList c;
    public final CopyOnWriteArrayList d;
    public final hvc e;
    public f0e f;
    public final Object g;
    public final Object h;
    public String i;
    public yv j;
    public final RecaptchaAction k;
    public final RecaptchaAction l;
    public final RecaptchaAction m;
    public final odd n;
    public final lee o;
    public final l99 p;
    public l97 q;
    public final Executor r;
    public final Executor s;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:109:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x015c  */
    /* JADX WARN: Type inference failed for: r15v0, types: [vf4, gee] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public FirebaseAuth(defpackage.qf4 r17, defpackage.l99 r18, java.util.concurrent.Executor r19, java.util.concurrent.Executor r20) {
        /*
            Method dump skipped, instructions count: 820
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.auth.FirebaseAuth.<init>(qf4, l99, java.util.concurrent.Executor, java.util.concurrent.Executor):void");
    }

    public static void e(FirebaseAuth firebaseAuth, f0e f0eVar) {
        if (f0eVar != null) {
            String str = f0eVar.b.a;
            Log.d("FirebaseAuth", "Notifying auth state listeners about user ( " + str + " ).");
        } else {
            Log.d("FirebaseAuth", "Notifying auth state listeners about a sign-out event.");
        }
        firebaseAuth.s.execute(new off(firebaseAuth));
    }

    /* JADX WARN: Removed duplicated region for block: B:131:0x0302  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0308  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0313  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x031a  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0334  */
    /* JADX WARN: Removed duplicated region for block: B:179:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00c4  */
    /* JADX WARN: Type inference failed for: r3v8, types: [java.lang.Object, l97] */
    /* JADX WARN: Type inference failed for: r5v7, types: [java.lang.Object, q9e] */
    /* JADX WARN: Type inference failed for: r7v4, types: [android.os.Handler, ovd] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void f(com.google.firebase.auth.FirebaseAuth r18, defpackage.f0e r19, defpackage.p4e r20, boolean r21, boolean r22) {
        /*
            Method dump skipped, instructions count: 966
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.auth.FirebaseAuth.f(com.google.firebase.auth.FirebaseAuth, f0e, p4e, boolean, boolean):void");
    }

    public static void g(FirebaseAuth firebaseAuth, f0e f0eVar) {
        String str;
        if (f0eVar != null) {
            String str2 = f0eVar.b.a;
            Log.d("FirebaseAuth", "Notifying id token listeners about user ( " + str2 + " ).");
        } else {
            Log.d("FirebaseAuth", "Notifying id token listeners about a sign-out event.");
        }
        if (f0eVar != null) {
            str = f0eVar.a.b;
        } else {
            str = null;
        }
        firebaseAuth.s.execute(new off(firebaseAuth, new k06(str)));
    }

    public static FirebaseAuth getInstance() {
        e0e e0eVar = (e0e) qf4.d().b(e0e.class);
        am8.s(e0eVar);
        return e0eVar.a();
    }

    public f0e a() {
        return this.f;
    }

    public Task b(c70 c70Var) {
        n5 n5Var;
        c70 d = c70Var.d();
        if (d instanceof kp3) {
            kp3 kp3Var = (kp3) d;
            String str = kp3Var.c;
            if (TextUtils.isEmpty(str)) {
                String str2 = kp3Var.a;
                String str3 = kp3Var.b;
                am8.s(str3);
                String str4 = this.i;
                return new hyd(this, str2, false, null, str3, str4).B(this, str4, this.l);
            }
            am8.p(str);
            int i = n5.c;
            am8.p(str);
            try {
                n5Var = new n5(str);
            } catch (IllegalArgumentException unused) {
                n5Var = null;
            }
            if (n5Var != null && !TextUtils.equals(this.i, n5Var.b)) {
                return Tasks.forException(u0e.a(new Status(17072, null, null, null)));
            }
            return new kxd(this, false, null, kp3Var).B(this, this.i, this.k);
        }
        boolean z = d instanceof ru8;
        String str5 = this.i;
        qf4 qf4Var = this.a;
        hvc hvcVar = this.e;
        if (z) {
            wf4 wf4Var = new wf4(this);
            hvcVar.getClass();
            g2e.a.clear();
            xzd xzdVar = new xzd((ru8) d, 1);
            xzdVar.b(qf4Var);
            xzdVar.e = wf4Var;
            return hvcVar.q(xzdVar);
        }
        wf4 wf4Var2 = new wf4(this);
        hvcVar.getClass();
        pzd pzdVar = new pzd(d, str5, 2);
        pzdVar.b(qf4Var);
        pzdVar.e = wf4Var2;
        return hvcVar.q(pzdVar);
    }

    public void c() {
        odd oddVar = this.n;
        am8.s(oddVar);
        SharedPreferences sharedPreferences = (SharedPreferences) oddVar.d;
        f0e f0eVar = this.f;
        if (f0eVar != null) {
            sharedPreferences.edit().remove(s21.m("com.google.firebase.auth.GET_TOKEN_RESPONSE.", f0eVar.b.a)).apply();
            this.f = null;
        }
        sharedPreferences.edit().remove("com.google.firebase.auth.FIREBASE_USER").apply();
        g(this, null);
        e(this, null);
        l97 l97Var = this.q;
        if (l97Var != null) {
            q9e q9eVar = (q9e) l97Var.a;
            q9eVar.c.removeCallbacks(q9eVar.d);
        }
    }

    public final Task d(f0e f0eVar, boolean z) {
        if (f0eVar == null) {
            return Tasks.forException(u0e.a(new Status(17495, null, null, null)));
        }
        p4e p4eVar = f0eVar.a;
        if (p4eVar.zzg() && !z) {
            return Tasks.forResult(gbe.a(p4eVar.b));
        }
        String str = p4eVar.a;
        vf4 vf4Var = new vf4(this, 1);
        hvc hvcVar = this.e;
        hvcVar.getClass();
        mzd mzdVar = new mzd(str, 0);
        mzdVar.b(this.a);
        mzdVar.d = f0eVar;
        mzdVar.e = vf4Var;
        mzdVar.f = vf4Var;
        return hvcVar.q(mzdVar);
    }

    public static FirebaseAuth getInstance(qf4 qf4Var) {
        e0e e0eVar = (e0e) qf4Var.b(e0e.class);
        am8.s(e0eVar);
        return e0eVar.a();
    }
}
