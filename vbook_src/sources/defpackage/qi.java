package defpackage;

import com.reader.data.download.impl.AndroidDownloadService;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: qi  reason: default package */
/* loaded from: classes3.dex */
public final class qi implements vt4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ AndroidDownloadService b;

    public /* synthetic */ qi(AndroidDownloadService androidDownloadService, int i) {
        this.a = i;
        this.b = androidDownloadService;
    }

    @Override // defpackage.vt4
    public final Object invoke() {
        int i = this.a;
        AndroidDownloadService androidDownloadService = this.b;
        switch (i) {
            case 0:
                return hma.t(androidDownloadService).e(cm9.a(xf3.class), null, null);
            default:
                return hma.t(androidDownloadService).e(cm9.a(yf3.class), null, null);
        }
    }
}
