package com.google.android.play.core.integrity;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.tasks.TaskCompletionSource;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes.dex */
public final class at {
    private final otd a;
    private final otd b;

    public at(otd otdVar, otd otdVar2) {
        this.a = otdVar;
        this.b = otdVar2;
    }

    public final as a(Activity activity, TaskCompletionSource taskCompletionSource, jtd jtdVar) {
        Object a = this.a.a();
        a.getClass();
        k kVar = (k) this.b.a();
        kVar.getClass();
        activity.getClass();
        jtdVar.getClass();
        return new as((Context) a, kVar, activity, taskCompletionSource, jtdVar);
    }
}
