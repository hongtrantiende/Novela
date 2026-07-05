package defpackage;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.messaging.FirebaseMessaging;
import java.io.IOException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: og4  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class og4 implements SuccessContinuation {
    public final /* synthetic */ FirebaseMessaging a;
    public final /* synthetic */ String b;
    public final /* synthetic */ mz6 c;

    public /* synthetic */ og4(FirebaseMessaging firebaseMessaging, String str, mz6 mz6Var) {
        this.a = firebaseMessaging;
        this.b = str;
        this.c = mz6Var;
    }

    public Task a() {
        Task forException;
        Task continueWith;
        int i;
        FirebaseMessaging firebaseMessaging = this.a;
        String str = this.b;
        mz6 mz6Var = this.c;
        bm1 bm1Var = firebaseMessaging.d;
        boolean J = bm1Var.J();
        if (J && ((ui5) bm1Var.f).e() >= 261200000) {
            ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor(new ux7("Firebase-Messaging-Network-Io"));
            continueWith = ((hg4) ((ig4) bm1Var.d)).c().continueWithTask(newSingleThreadExecutor, new iu1(4, bm1Var, newSingleThreadExecutor));
        } else {
            yv yvVar = (yv) bm1Var.e;
            String d = ui5.d((qf4) yvVar.a);
            Bundle bundle = new Bundle();
            try {
                yvVar.B(d, bundle, J);
                kv9 kv9Var = (kv9) yvVar.c;
                f73 f73Var = f73.c;
                p88 p88Var = kv9Var.c;
                if (p88Var.E() < 12000000) {
                    if (p88Var.D() != 0) {
                        forException = kv9Var.b(bundle).continueWithTask(f73Var, new bbf(2, kv9Var, bundle));
                    } else {
                        forException = Tasks.forException(new IOException("MISSING_INSTANCEID_SERVICE"));
                    }
                } else {
                    vdf i2 = vdf.i(kv9Var.b);
                    synchronized (i2) {
                        i = i2.b;
                        i2.b = i + 1;
                    }
                    forException = i2.j(new e8f(i, 1, bundle, 1)).continueWith(f73Var, bl8.b);
                }
            } catch (InterruptedException | ExecutionException e) {
                forException = Tasks.forException(e);
            }
            continueWith = forException.continueWith(new az(1), new q6(yvVar, 23));
        }
        return continueWith.onSuccessTask(firebaseMessaging.h, new og4(firebaseMessaging, str, mz6Var));
    }

    @Override // com.google.android.gms.tasks.SuccessContinuation
    public Task then(Object obj) {
        String f;
        FirebaseMessaging firebaseMessaging = this.a;
        String str = this.b;
        mz6 mz6Var = this.c;
        String str2 = (String) obj;
        g99 c = FirebaseMessaging.c(firebaseMessaging.b);
        qf4 qf4Var = firebaseMessaging.a;
        qf4Var.a();
        if ("[DEFAULT]".equals(qf4Var.b)) {
            f = "";
        } else {
            f = qf4Var.f();
        }
        String c2 = firebaseMessaging.j.c();
        synchronized (c) {
            String b = mz6.b(System.currentTimeMillis(), str2, c2);
            if (b != null) {
                SharedPreferences.Editor edit = ((SharedPreferences) c.b).edit();
                edit.putString(f + "|T|" + str + "|*", b);
                edit.commit();
            }
        }
        if (firebaseMessaging.d.J() || mz6Var == null || !str2.equals((String) mz6Var.b)) {
            qf4 qf4Var2 = firebaseMessaging.a;
            qf4Var2.a();
            String str3 = qf4Var2.b;
            if ("[DEFAULT]".equals(str3)) {
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    StringBuilder sb = new StringBuilder("Invoking onNewToken for app: ");
                    qf4Var2.a();
                    sb.append(str3);
                    Log.d("FirebaseMessaging", sb.toString());
                }
                boolean J = firebaseMessaging.d.J();
                Intent intent = new Intent();
                intent.putExtra("token", str2);
                if (J) {
                    intent.setAction("com.google.firebase.messaging.FCM_REGISTERED");
                } else {
                    intent.setAction("com.google.firebase.messaging.NEW_TOKEN");
                }
                new kw5(firebaseMessaging.b, 1).A(intent);
            }
        }
        return Tasks.forResult(str2);
    }
}
