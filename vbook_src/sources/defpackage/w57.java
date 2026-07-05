package defpackage;

import android.media.session.MediaSessionManager;
import android.text.TextUtils;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: w57  reason: default package */
/* loaded from: classes.dex */
public class w57 extends v57 {
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, z57] */
    @Override // defpackage.v57
    public final z57 b() {
        MediaSessionManager.RemoteUserInfo currentControllerInfo = this.a.getCurrentControllerInfo();
        ?? obj = new Object();
        String packageName = currentControllerInfo.getPackageName();
        if (packageName != null) {
            if (!TextUtils.isEmpty(packageName)) {
                obj.a = new c67(currentControllerInfo.getPackageName(), currentControllerInfo.getPid(), currentControllerInfo.getUid());
                return obj;
            }
            vs.m("packageName should be nonempty");
            return null;
        }
        xk5.k("package shouldn't be null");
        return null;
    }

    @Override // defpackage.v57
    public final void d(z57 z57Var) {
    }
}
