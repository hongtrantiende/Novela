package defpackage;

import android.content.ContentResolver;
import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: t40  reason: default package */
/* loaded from: classes.dex */
public final class t40 extends ContentObserver {
    public final ContentResolver a;
    public final Uri b;
    public final /* synthetic */ koc c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t40(koc kocVar, Handler handler, ContentResolver contentResolver, Uri uri) {
        super(handler);
        this.c = kocVar;
        this.a = contentResolver;
        this.b = uri;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        this.c.i();
    }
}
