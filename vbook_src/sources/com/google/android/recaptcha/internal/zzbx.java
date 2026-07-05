package com.google.android.recaptcha.internal;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes.dex */
public final class zzbx {
    public static final gz2 zza(Task task) {
        final bt1 c = jxe.c();
        task.addOnCompleteListener(zzbv.zza, new OnCompleteListener() { // from class: com.google.android.recaptcha.internal.zzbu
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task2) {
                at1 at1Var = at1.this;
                Exception exception = task2.getException();
                if (exception == null) {
                    if (task2.isCanceled()) {
                        ((l36) at1Var).cancel(null);
                        return;
                    }
                    ((bt1) at1Var).P(task2.getResult());
                    return;
                }
                ((bt1) at1Var).o0(exception);
            }
        });
        return new zzbw(c);
    }
}
