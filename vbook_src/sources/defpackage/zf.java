package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: zf  reason: default package */
/* loaded from: classes.dex */
public final class zf {
    public k6 b;
    public Context c;
    public di2 d;
    public final List a = ks3.a;
    public final cza e = dza.a(null);

    public final zg4 a(fw2 fw2Var) {
        int i;
        String str;
        rfd ij1Var;
        fw2Var.getClass();
        Context context = this.c;
        if (context != null) {
            List<ResolveInfo> queryIntentActivities = context.getPackageManager().queryIntentActivities(new Intent("android.intent.action.VIEW", Uri.parse("http://www.example.com")), 131072);
            queryIntentActivities.getClass();
            Intent intent = new Intent();
            intent.setAction("android.support.customtabs.action.CustomTabsService");
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = queryIntentActivities.iterator();
            while (true) {
                i = 0;
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                intent.setPackage(((ResolveInfo) next).activityInfo.packageName);
                if (context.getPackageManager().resolveService(intent, 0) != null) {
                    arrayList.add(next);
                }
            }
            ArrayList arrayList2 = new ArrayList(tl1.s(arrayList, 10));
            int size = arrayList.size();
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                arrayList2.add(((ResolveInfo) obj).activityInfo.packageName);
            }
            List list = this.a;
            if (!list.isEmpty()) {
                ArrayList arrayList3 = new ArrayList();
                for (Object obj2 : list) {
                    if (arrayList2.contains((String) obj2)) {
                        arrayList3.add(obj2);
                    }
                }
                str = (String) sl1.e0(arrayList3);
            } else {
                str = (String) sl1.e0(arrayList2);
            }
            Context context2 = this.c;
            if (str == null) {
                if (context2 != null) {
                    k6 k6Var = this.b;
                    if (k6Var != null) {
                        ij1Var = new hvc(context2, k6Var);
                    } else {
                        c16.w("activityResultLauncher");
                        throw null;
                    }
                } else {
                    c16.w("context");
                    throw null;
                }
            } else if (context2 != null) {
                k6 k6Var2 = this.b;
                if (k6Var2 != null) {
                    ij1Var = new ij1(context2, k6Var2, str);
                } else {
                    c16.w("activityResultLauncher");
                    throw null;
                }
            } else {
                c16.w("context");
                throw null;
            }
            di2 di2Var = this.d;
            if (di2Var != null) {
                return new zg4(fw2Var, di2Var, ij1Var);
            }
            c16.w("preferences");
            throw null;
        }
        c16.w("context");
        throw null;
    }
}
