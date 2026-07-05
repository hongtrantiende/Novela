package defpackage;

import android.net.Uri;
import com.google.common.util.concurrent.ListenableFuture;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: s1f  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class s1f implements c10 {
    public static final /* synthetic */ s1f b = new s1f(0);
    public static final /* synthetic */ s1f c = new s1f(2);
    public final /* synthetic */ int a;

    public /* synthetic */ s1f(int i) {
        this.a = i;
    }

    @Override // defpackage.c10
    public final /* synthetic */ ListenableFuture apply(Object obj) {
        switch (this.a) {
            case 0:
                fv fvVar = (fv) obj;
                throw new r1f(fvVar.getStatusCode(), fvVar.getMessage(), fvVar);
            case 1:
                hzd hzdVar = (hzd) obj;
                throw null;
            default:
                Uri uri = (Uri) obj;
                return dv4.c("");
        }
    }
}
