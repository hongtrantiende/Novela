package defpackage;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Binder;
import android.os.Process;
import android.view.autofill.AutofillId;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: zd0  reason: default package */
/* loaded from: classes.dex */
public final class zd0 {
    public final Object a;

    public /* synthetic */ zd0(Object obj) {
        this.a = obj;
    }

    public ApplicationInfo a(int i, String str) {
        return ((Context) this.a).getPackageManager().getApplicationInfo(str, i);
    }

    public PackageInfo b(int i, String str) {
        return ((Context) this.a).getPackageManager().getPackageInfo(str, i);
    }

    public boolean c() {
        String nameForUid;
        Context context = (Context) this.a;
        if (Binder.getCallingUid() == Process.myUid()) {
            return ay5.n(context);
        }
        if (yz1.o() && (nameForUid = context.getPackageManager().getNameForUid(Binder.getCallingUid())) != null) {
            return context.getPackageManager().isInstantApp(nameForUid);
        }
        return false;
    }

    public AutofillId d() {
        return vs.e(this.a);
    }
}
