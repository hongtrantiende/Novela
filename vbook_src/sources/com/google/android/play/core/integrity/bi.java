package com.google.android.play.core.integrity;

import android.os.Bundle;
import com.google.android.gms.tasks.TaskCompletionSource;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes.dex */
class bi extends vtd {
    final TaskCompletionSource a;
    final /* synthetic */ bn b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bi(bn bnVar, TaskCompletionSource taskCompletionSource) {
        super("com.google.android.play.core.integrity.protocol.IExpressIntegrityServiceCallback");
        this.b = bnVar;
        this.a = taskCompletionSource;
    }

    @Override // defpackage.vtd
    public final void b(Bundle bundle) {
        this.b.a.d(this.a);
    }

    @Override // defpackage.vtd
    public void c(Bundle bundle) {
        this.b.a.d(this.a);
    }

    @Override // defpackage.vtd
    public final void d(Bundle bundle) {
        this.b.a.d(this.a);
    }

    @Override // defpackage.vtd
    public void e(Bundle bundle) {
        this.b.a.d(this.a);
    }
}
