package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: pu1  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class pu1 implements l99 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ pu1(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [xf2, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, yv] */
    @Override // defpackage.l99
    public final Object get() {
        boolean z;
        ApplicationInfo applicationInfo;
        Bundle bundle;
        int i = this.a;
        boolean z2 = true;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                qu1 qu1Var = (qu1) obj2;
                pt1 pt1Var = (pt1) obj;
                hu1 hu1Var = pt1Var.f;
                ?? obj3 = new Object();
                HashSet hashSet = new HashSet();
                HashSet hashSet2 = new HashSet();
                HashSet hashSet3 = new HashSet();
                HashSet hashSet4 = new HashSet();
                HashSet hashSet5 = new HashSet();
                Set<x13> set = pt1Var.c;
                Set set2 = pt1Var.g;
                for (x13 x13Var : set) {
                    int i2 = x13Var.c;
                    int i3 = x13Var.b;
                    if (i2 == 0) {
                        z = z2;
                    } else {
                        z = false;
                    }
                    mf9 mf9Var = x13Var.a;
                    if (z) {
                        if (i3 == 2) {
                            hashSet4.add(mf9Var);
                        } else {
                            hashSet.add(mf9Var);
                        }
                    } else if (i2 == 2) {
                        hashSet3.add(mf9Var);
                    } else if (i3 == 2) {
                        hashSet5.add(mf9Var);
                    } else {
                        hashSet2.add(mf9Var);
                    }
                    z2 = true;
                }
                if (!set2.isEmpty()) {
                    hashSet.add(mf9.a(fa9.class));
                }
                obj3.a = Collections.unmodifiableSet(hashSet);
                obj3.b = Collections.unmodifiableSet(hashSet2);
                obj3.c = Collections.unmodifiableSet(hashSet3);
                obj3.d = Collections.unmodifiableSet(hashSet4);
                obj3.e = Collections.unmodifiableSet(hashSet5);
                obj3.f = qu1Var;
                return hu1Var.j(obj3);
            case 1:
                return new m55((Context) obj2, (String) obj);
            default:
                qf4 qf4Var = (qf4) obj2;
                String f = qf4Var.f();
                fa9 fa9Var = (fa9) qf4Var.d.a(fa9.class);
                ?? obj4 = new Object();
                Context createDeviceProtectedStorageContext = ((Context) obj).createDeviceProtectedStorageContext();
                SharedPreferences sharedPreferences = createDeviceProtectedStorageContext.getSharedPreferences("com.google.firebase.common.prefs:".concat(f), 0);
                if (sharedPreferences.contains("firebase_data_collection_default_enabled")) {
                    z2 = sharedPreferences.getBoolean("firebase_data_collection_default_enabled", true);
                } else {
                    try {
                        PackageManager packageManager = createDeviceProtectedStorageContext.getPackageManager();
                        if (packageManager != null && (applicationInfo = packageManager.getApplicationInfo(createDeviceProtectedStorageContext.getPackageName(), Token.CASE)) != null && (bundle = applicationInfo.metaData) != null && bundle.containsKey("firebase_data_collection_default_enabled")) {
                            z2 = applicationInfo.metaData.getBoolean("firebase_data_collection_default_enabled");
                        }
                    } catch (PackageManager.NameNotFoundException unused) {
                    }
                }
                obj4.a = z2;
                return obj4;
        }
    }
}
