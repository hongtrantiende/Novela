package defpackage;

import android.content.ClipDescription;
import android.net.Uri;
import android.view.inputmethod.InputContentInfo;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: hw5  reason: default package */
/* loaded from: classes.dex */
public final class hw5 implements iw5 {
    public final InputContentInfo a;

    public hw5(Uri uri, ClipDescription clipDescription, Uri uri2) {
        this.a = new InputContentInfo(uri, clipDescription, uri2);
    }

    @Override // defpackage.iw5
    public final Uri g() {
        return this.a.getContentUri();
    }

    @Override // defpackage.iw5
    public final ClipDescription getDescription() {
        return this.a.getDescription();
    }

    @Override // defpackage.iw5
    public final void l() {
        this.a.requestPermission();
    }

    @Override // defpackage.iw5
    public final Uri m() {
        return this.a.getLinkUri();
    }

    @Override // defpackage.iw5
    public final Object t() {
        return this.a;
    }

    public hw5(Object obj) {
        this.a = (InputContentInfo) obj;
    }
}
