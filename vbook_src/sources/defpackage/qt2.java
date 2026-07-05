package defpackage;

import android.content.pm.PackageManager;
import android.content.pm.Signature;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: qt2  reason: default package */
/* loaded from: classes.dex */
public final class qt2 extends hq7 {
    @Override // defpackage.hq7
    public final Signature[] m(PackageManager packageManager, String str) {
        return packageManager.getPackageInfo(str, 64).signatures;
    }
}
