package defpackage;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: zt1  reason: default package */
/* loaded from: classes.dex */
public final class zt1 {
    public final LinkedHashMap a = new LinkedHashMap();
    public final LinkedHashMap b = new LinkedHashMap();
    public final LinkedHashMap c = new LinkedHashMap();
    public final ArrayList d = new ArrayList();
    public final transient LinkedHashMap e = new LinkedHashMap();
    public final LinkedHashMap f = new LinkedHashMap();
    public final Bundle g = new Bundle();
    public final /* synthetic */ bu1 h;

    public zt1(bu1 bu1Var) {
        this.h = bu1Var;
    }

    public final boolean a(int i, int i2, Intent intent) {
        a6 a6Var;
        String str = (String) this.a.get(Integer.valueOf(i));
        if (str == null) {
            return false;
        }
        m6 m6Var = (m6) this.e.get(str);
        if (m6Var != null) {
            a6Var = m6Var.a;
        } else {
            a6Var = null;
        }
        if (a6Var != null) {
            ArrayList arrayList = this.d;
            if (arrayList.contains(str)) {
                m6Var.a.e(m6Var.b.o(intent, i2));
                arrayList.remove(str);
                return true;
            }
        }
        this.f.remove(str);
        this.g.putParcelable(str, new z5(intent, i2));
        return true;
    }

    public final void b(int i, voe voeVar, Object obj) {
        Bundle bundle;
        int i2;
        String[] strArr;
        bu1 bu1Var = this.h;
        uwd l = voeVar.l(bu1Var, obj);
        if (l != null) {
            new Handler(Looper.getMainLooper()).post(new yt1(this, i, l, 0));
            return;
        }
        Intent k = voeVar.k(bu1Var, obj);
        if (k.getExtras() != null) {
            Bundle extras = k.getExtras();
            extras.getClass();
            if (extras.getClassLoader() == null) {
                k.setExtrasClassLoader(bu1Var.getClassLoader());
            }
        }
        if (k.hasExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) {
            bundle = k.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
            k.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
        } else {
            bundle = null;
        }
        Bundle bundle2 = bundle;
        if ("androidx.activity.result.contract.action.REQUEST_PERMISSIONS".equals(k.getAction())) {
            String[] stringArrayExtra = k.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
            if (stringArrayExtra == null) {
                stringArrayExtra = new String[0];
            }
            HashSet hashSet = new HashSet();
            for (int i3 = 0; i3 < stringArrayExtra.length; i3++) {
                if (!TextUtils.isEmpty(stringArrayExtra[i3])) {
                    if (Build.VERSION.SDK_INT < 33 && TextUtils.equals(stringArrayExtra[i3], "android.permission.POST_NOTIFICATIONS")) {
                        hashSet.add(Integer.valueOf(i3));
                    }
                } else {
                    vs.m(s21.q(new StringBuilder("Permission request for permissions "), Arrays.toString(stringArrayExtra), " must not contain null or empty values"));
                    return;
                }
            }
            int size = hashSet.size();
            if (size > 0) {
                strArr = new String[stringArrayExtra.length - size];
            } else {
                strArr = stringArrayExtra;
            }
            if (size > 0) {
                if (size == stringArrayExtra.length) {
                    return;
                }
                int i4 = 0;
                for (int i5 = 0; i5 < stringArrayExtra.length; i5++) {
                    if (!hashSet.contains(Integer.valueOf(i5))) {
                        strArr[i4] = stringArrayExtra[i5];
                        i4++;
                    }
                }
            }
            bu1Var.requestPermissions(stringArrayExtra, i);
        } else if ("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST".equals(k.getAction())) {
            cz5 cz5Var = (cz5) k.getParcelableExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST");
            try {
                cz5Var.getClass();
                i2 = i;
            } catch (IntentSender.SendIntentException e) {
                e = e;
                i2 = i;
            }
            try {
                bu1Var.startIntentSenderForResult(cz5Var.a, i2, cz5Var.b, cz5Var.c, cz5Var.d, 0, bundle2);
            } catch (IntentSender.SendIntentException e2) {
                e = e2;
                new Handler(Looper.getMainLooper()).post(new yt1(this, i2, e, 1));
            }
        } else {
            bu1Var.startActivityForResult(k, i, bundle2);
        }
    }

    public final o6 c(String str, voe voeVar, a6 a6Var) {
        str.getClass();
        d(str);
        this.e.put(str, new m6(a6Var, voeVar));
        LinkedHashMap linkedHashMap = this.f;
        if (linkedHashMap.containsKey(str)) {
            Object obj = linkedHashMap.get(str);
            linkedHashMap.remove(str);
            a6Var.e(obj);
        }
        Bundle bundle = this.g;
        z5 z5Var = (z5) oc2.D(bundle, str, z5.class);
        if (z5Var != null) {
            bundle.remove(str);
            a6Var.e(voeVar.o(z5Var.b, z5Var.a));
        }
        return new o6(this, str, voeVar, 1);
    }

    public final void d(String str) {
        LinkedHashMap linkedHashMap = this.b;
        if (((Integer) linkedHashMap.get(str)) != null) {
            return;
        }
        i iVar = new i(1);
        Iterator it = new k02(new ki4(1, iVar, new ux9(iVar, 6))).iterator();
        while (it.hasNext()) {
            Number number = (Number) it.next();
            Integer valueOf = Integer.valueOf(number.intValue());
            LinkedHashMap linkedHashMap2 = this.a;
            if (!linkedHashMap2.containsKey(valueOf)) {
                int intValue = number.intValue();
                linkedHashMap2.put(Integer.valueOf(intValue), str);
                linkedHashMap.put(str, Integer.valueOf(intValue));
                return;
            }
        }
        p1a.l("Sequence contains no element matching the predicate.");
    }

    public final void e(String str) {
        Integer num;
        str.getClass();
        if (!this.d.contains(str) && (num = (Integer) this.b.remove(str)) != null) {
            this.a.remove(num);
        }
        this.e.remove(str);
        LinkedHashMap linkedHashMap = this.f;
        if (linkedHashMap.containsKey(str)) {
            StringBuilder o = a82.o("Dropping pending result for request ", str, ": ");
            o.append(linkedHashMap.get(str));
            Log.w("ActivityResultRegistry", o.toString());
            linkedHashMap.remove(str);
        }
        Bundle bundle = this.g;
        if (bundle.containsKey(str)) {
            Log.w("ActivityResultRegistry", "Dropping pending result for request " + str + ": " + ((z5) oc2.D(bundle, str, z5.class)));
            bundle.remove(str);
        }
        LinkedHashMap linkedHashMap2 = this.c;
        n6 n6Var = (n6) linkedHashMap2.get(str);
        if (n6Var != null) {
            ArrayList arrayList = n6Var.b;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                n6Var.a.f((rn6) obj);
            }
            arrayList.clear();
            linkedHashMap2.remove(str);
        }
    }
}
