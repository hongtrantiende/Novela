package com.google.firebase.analytics;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.tasks.Tasks;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes.dex */
public final class FirebaseAnalytics {
    public static volatile FirebaseAnalytics b;
    public final qke a;

    public FirebaseAnalytics(qke qkeVar) {
        am8.s(qkeVar);
        this.a = qkeVar;
    }

    public static FirebaseAnalytics getInstance(Context context) {
        if (b == null) {
            synchronized (FirebaseAnalytics.class) {
                try {
                    if (b == null) {
                        b = new FirebaseAnalytics(qke.c(context, null));
                    }
                } finally {
                }
            }
        }
        return b;
    }

    public static b0f getScionFrontendApiImplementation(Context context, Bundle bundle) {
        qke c = qke.c(context, bundle);
        if (c == null) {
            return null;
        }
        return new ige(c);
    }

    public String getFirebaseInstanceId() {
        try {
            Object obj = hg4.m;
            return (String) Tasks.await(((hg4) qf4.d().b(ig4.class)).c(), 30000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            p1a.n(e);
            return null;
        } catch (ExecutionException e2) {
            p1a.n(e2.getCause());
            return null;
        } catch (TimeoutException unused) {
            throw new IllegalThreadStateException("Firebase Installations getId Task has timed out.");
        }
    }

    @Deprecated
    public void setCurrentScreen(Activity activity, String str, String str2) {
        ahe c = ahe.c(activity);
        qke qkeVar = this.a;
        qkeVar.getClass();
        qkeVar.a(new ohe(qkeVar, c, str, str2));
    }
}
