package defpackage;

import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: b6  reason: default package */
/* loaded from: classes.dex */
public final class b6 extends voe {
    public final /* synthetic */ int l;

    public /* synthetic */ b6(int i) {
        this.l = i;
    }

    @Override // defpackage.voe
    public final Intent k(Context context, Object obj) {
        Bundle bundleExtra;
        switch (this.l) {
            case 0:
                String[] strArr = (String[]) obj;
                strArr.getClass();
                Intent type = new Intent("android.intent.action.OPEN_DOCUMENT").putExtra("android.intent.extra.MIME_TYPES", strArr).setType("*/*");
                type.getClass();
                return type;
            case 1:
                String[] strArr2 = (String[]) obj;
                strArr2.getClass();
                Intent type2 = new Intent("android.intent.action.OPEN_DOCUMENT").putExtra("android.intent.extra.MIME_TYPES", strArr2).putExtra("android.intent.extra.ALLOW_MULTIPLE", true).setType("*/*");
                type2.getClass();
                return type2;
            case 2:
                xu8 xu8Var = (xu8) obj;
                xu8Var.getClass();
                if (qka.n()) {
                    Intent intent = new Intent("android.provider.action.PICK_IMAGES");
                    intent.setType(qka.j(xu8Var.a));
                    intent.putExtra("android.provider.extra.PICK_IMAGES_LAUNCH_TAB", 1);
                    return intent;
                } else if (qka.i(context) != null) {
                    ResolveInfo i = qka.i(context);
                    if (i != null) {
                        ActivityInfo activityInfo = i.activityInfo;
                        Intent intent2 = new Intent("androidx.activity.result.contract.action.PICK_IMAGES");
                        intent2.setClassName(activityInfo.applicationInfo.packageName, activityInfo.name);
                        intent2.setType(qka.j(xu8Var.a));
                        intent2.putExtra("androidx.activity.result.contract.extra.PICK_IMAGES_LAUNCH_TAB", 1);
                        return intent2;
                    }
                    vs.k("Required value was null.");
                    return null;
                } else {
                    Intent intent3 = new Intent("android.intent.action.OPEN_DOCUMENT");
                    intent3.setType(qka.j(xu8Var.a));
                    if (intent3.getType() == null) {
                        intent3.setType("*/*");
                        intent3.putExtra("android.intent.extra.MIME_TYPES", new String[]{"image/*", "video/*"});
                        return intent3;
                    }
                    return intent3;
                }
            case 3:
                String[] strArr3 = (String[]) obj;
                strArr3.getClass();
                Intent putExtra = new Intent("androidx.activity.result.contract.action.REQUEST_PERMISSIONS").putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr3);
                putExtra.getClass();
                return putExtra;
            case 4:
                String str = (String) obj;
                str.getClass();
                Intent putExtra2 = new Intent("androidx.activity.result.contract.action.REQUEST_PERMISSIONS").putExtra("androidx.activity.result.contract.extra.PERMISSIONS", new String[]{str});
                putExtra2.getClass();
                return putExtra2;
            case 5:
                Intent intent4 = (Intent) obj;
                intent4.getClass();
                return intent4;
            case 6:
                eb2 eb2Var = (eb2) obj;
                eb2Var.getClass();
                String str2 = eb2Var.a;
                str2.getClass();
                Intent putExtra3 = new Intent("android.intent.action.CREATE_DOCUMENT").setType(str2).putExtra("android.intent.extra.TITLE", eb2Var.b);
                putExtra3.getClass();
                String[] strArr4 = eb2Var.c;
                if (strArr4 != null) {
                    putExtra3.putExtra("android.intent.extra.MIME_TYPES", strArr4);
                }
                return putExtra3;
            case 7:
                pm3 pm3Var = (pm3) obj;
                pm3Var.getClass();
                return new c6(r4.h()).k(context, pm3Var.a);
            default:
                cz5 cz5Var = (cz5) obj;
                Intent intent5 = new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST");
                Intent intent6 = cz5Var.b;
                if (intent6 != null && (bundleExtra = intent6.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) != null) {
                    intent5.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundleExtra);
                    intent6.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                    if (intent6.getBooleanExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", false)) {
                        cz5Var = new cz5(cz5Var.a, null, cz5Var.c, cz5Var.d);
                    }
                }
                intent5.putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", cz5Var);
                if (hs4.K(2)) {
                    Log.v("FragmentManager", "CreateIntent created the following intent: " + intent5);
                }
                return intent5;
        }
    }

    @Override // defpackage.voe
    public uwd l(Context context, Object obj) {
        switch (this.l) {
            case 0:
                ((String[]) obj).getClass();
                return null;
            case 1:
                ((String[]) obj).getClass();
                return null;
            case 2:
                ((xu8) obj).getClass();
                return null;
            case 3:
                String[] strArr = (String[]) obj;
                strArr.getClass();
                if (strArr.length == 0) {
                    return new uwd(ls3.a, 2);
                }
                for (String str : strArr) {
                    if (eze.f(context, str) != 0) {
                        return null;
                    }
                }
                int k = p17.k(strArr.length);
                if (k < 16) {
                    k = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(k);
                for (String str2 : strArr) {
                    linkedHashMap.put(str2, Boolean.TRUE);
                }
                return new uwd(linkedHashMap, 2);
            case 4:
                String str3 = (String) obj;
                str3.getClass();
                if (eze.f(context, str3) != 0) {
                    return null;
                }
                return new uwd(Boolean.TRUE, 2);
            default:
                return super.l(context, obj);
        }
    }

    @Override // defpackage.voe
    public final Object o(Intent intent, int i) {
        boolean z;
        int i2 = this.l;
        List list = ks3.a;
        boolean z2 = true;
        int i3 = 0;
        switch (i2) {
            case 0:
                if (i != -1) {
                    intent = null;
                }
                if (intent == null) {
                    return null;
                }
                return intent.getData();
            case 1:
                if (i != -1) {
                    intent = null;
                }
                if (intent != null) {
                    LinkedHashSet linkedHashSet = new LinkedHashSet();
                    Uri data = intent.getData();
                    if (data != null) {
                        linkedHashSet.add(data);
                    }
                    ClipData clipData = intent.getClipData();
                    if (clipData != null || !linkedHashSet.isEmpty()) {
                        if (clipData != null) {
                            int itemCount = clipData.getItemCount();
                            while (i3 < itemCount) {
                                Uri uri = clipData.getItemAt(i3).getUri();
                                if (uri != null) {
                                    linkedHashSet.add(uri);
                                }
                                i3++;
                            }
                        }
                        return new ArrayList(linkedHashSet);
                    }
                    return list;
                }
                return list;
            case 2:
                if (i != -1) {
                    intent = null;
                }
                if (intent == null) {
                    return null;
                }
                Uri data2 = intent.getData();
                if (data2 == null) {
                    LinkedHashSet linkedHashSet2 = new LinkedHashSet();
                    Uri data3 = intent.getData();
                    if (data3 != null) {
                        linkedHashSet2.add(data3);
                    }
                    ClipData clipData2 = intent.getClipData();
                    if (clipData2 != null || !linkedHashSet2.isEmpty()) {
                        if (clipData2 != null) {
                            int itemCount2 = clipData2.getItemCount();
                            while (i3 < itemCount2) {
                                Uri uri2 = clipData2.getItemAt(i3).getUri();
                                if (uri2 != null) {
                                    linkedHashSet2.add(uri2);
                                }
                                i3++;
                            }
                        }
                        list = new ArrayList(linkedHashSet2);
                    }
                    return (Uri) sl1.e0(list);
                }
                return data2;
            case 3:
                if (i == -1 && intent != null) {
                    String[] stringArrayExtra = intent.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
                    int[] intArrayExtra = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
                    if (intArrayExtra != null && stringArrayExtra != null) {
                        ArrayList arrayList = new ArrayList(intArrayExtra.length);
                        for (int i4 : intArrayExtra) {
                            if (i4 == 0) {
                                z = true;
                            } else {
                                z = false;
                            }
                            arrayList.add(Boolean.valueOf(z));
                        }
                        ArrayList l0 = b00.l0(stringArrayExtra);
                        Iterator it = l0.iterator();
                        Iterator it2 = arrayList.iterator();
                        ArrayList arrayList2 = new ArrayList(Math.min(tl1.s(l0, 10), tl1.s(arrayList, 10)));
                        while (it.hasNext() && it2.hasNext()) {
                            arrayList2.add(new yk8(it.next(), it2.next()));
                        }
                        return o17.x(arrayList2);
                    }
                }
                return ls3.a;
            case 4:
                if (intent != null && i == -1) {
                    int[] intArrayExtra2 = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
                    if (intArrayExtra2 != null) {
                        for (int i5 : intArrayExtra2) {
                            if (i5 == 0) {
                                return Boolean.valueOf(z2);
                            }
                        }
                    }
                    z2 = false;
                    return Boolean.valueOf(z2);
                }
                return Boolean.FALSE;
            case 5:
                return new z5(intent, i);
            case 6:
                if (i != -1) {
                    intent = null;
                }
                if (intent == null) {
                    return null;
                }
                return intent.getData();
            case 7:
                if (r4.h() > 1) {
                    if (i != -1) {
                        intent = null;
                    }
                    if (intent != null) {
                        LinkedHashSet linkedHashSet3 = new LinkedHashSet();
                        Uri data4 = intent.getData();
                        if (data4 != null) {
                            linkedHashSet3.add(data4);
                        }
                        ClipData clipData3 = intent.getClipData();
                        if (clipData3 != null || !linkedHashSet3.isEmpty()) {
                            if (clipData3 != null) {
                                int itemCount3 = clipData3.getItemCount();
                                while (i3 < itemCount3) {
                                    Uri uri3 = clipData3.getItemAt(i3).getUri();
                                    if (uri3 != null) {
                                        linkedHashSet3.add(uri3);
                                    }
                                    i3++;
                                }
                            }
                            return new ArrayList(linkedHashSet3);
                        }
                        return list;
                    }
                    return list;
                }
                vs.m("Max items must be higher than 1");
                return null;
            default:
                return new z5(intent, i);
        }
    }
}
