package com.google.android.play.core.integrity;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import com.google.android.gms.tasks.TaskCompletionSource;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes.dex */
public final class be extends cud {
    final /* synthetic */ Context a;
    final /* synthetic */ bn b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public be(bn bnVar, TaskCompletionSource taskCompletionSource, Context context) {
        super(taskCompletionSource);
        this.b = bnVar;
        this.a = context;
    }

    @Override // defpackage.cud
    public final void b() {
        TaskCompletionSource taskCompletionSource;
        int i;
        PackageInfo packageInfo;
        ApplicationInfo applicationInfo;
        Context context = this.a;
        taskCompletionSource = this.b.d;
        bud budVar = ltd.a;
        try {
            packageInfo = context.getPackageManager().getPackageInfo("com.android.vending", 64);
            applicationInfo = packageInfo.applicationInfo;
        } catch (PackageManager.NameNotFoundException unused) {
        }
        if (applicationInfo != null && applicationInfo.enabled && ltd.a(packageInfo.signatures)) {
            i = packageInfo.versionCode;
            taskCompletionSource.trySetResult(Integer.valueOf(i));
        }
        i = 0;
        taskCompletionSource.trySetResult(Integer.valueOf(i));
    }
}
