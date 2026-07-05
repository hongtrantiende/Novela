package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.service.media.MediaBrowserService;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: w37  reason: default package */
/* loaded from: classes.dex */
public final class w37 extends v37 {
    public final /* synthetic */ x37 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w37(x37 x37Var, Context context) {
        super(x37Var, context);
        this.b = x37Var;
    }

    @Override // android.service.media.MediaBrowserService
    public final void onLoadChildren(String str, MediaBrowserService.Result result, Bundle bundle) {
        y57.a(bundle);
        this.b.E.b();
    }
}
