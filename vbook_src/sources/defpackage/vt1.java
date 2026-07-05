package defpackage;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.LinkedHashMap;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: vt1  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class vt1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ bu1 b;

    public /* synthetic */ vt1(bu1 bu1Var, int i) {
        this.a = i;
        this.b = bu1Var;
    }

    public final void a(bu1 bu1Var) {
        int i = this.a;
        bu1 bu1Var2 = this.b;
        switch (i) {
            case 0:
                bu1Var.getClass();
                Bundle q = ((s26) bu1Var2.d.c).q("android:support:activity-result");
                if (q != null) {
                    zt1 zt1Var = bu1Var2.E;
                    LinkedHashMap linkedHashMap = zt1Var.b;
                    LinkedHashMap linkedHashMap2 = zt1Var.a;
                    Bundle bundle = zt1Var.g;
                    ArrayList<Integer> integerArrayList = q.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
                    ArrayList<String> stringArrayList = q.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
                    if (stringArrayList != null && integerArrayList != null) {
                        ArrayList<String> stringArrayList2 = q.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
                        if (stringArrayList2 != null) {
                            zt1Var.d.addAll(stringArrayList2);
                        }
                        Bundle bundle2 = q.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT");
                        if (bundle2 != null) {
                            bundle.putAll(bundle2);
                        }
                        int size = stringArrayList.size();
                        for (int i2 = 0; i2 < size; i2++) {
                            String str = stringArrayList.get(i2);
                            if (linkedHashMap.containsKey(str)) {
                                Integer num = (Integer) linkedHashMap.remove(str);
                                if (!bundle.containsKey(str)) {
                                    jsc.s(linkedHashMap2).remove(num);
                                }
                            }
                            Integer num2 = integerArrayList.get(i2);
                            num2.getClass();
                            int intValue = num2.intValue();
                            String str2 = stringArrayList.get(i2);
                            str2.getClass();
                            String str3 = str2;
                            linkedHashMap2.put(Integer.valueOf(intValue), str3);
                            zt1Var.b.put(str3, Integer.valueOf(intValue));
                        }
                        return;
                    }
                    return;
                }
                return;
            default:
                tr4 tr4Var = (tr4) ((ur4) bu1Var2).R.a;
                tr4Var.f.b(tr4Var, tr4Var, null);
                return;
        }
    }
}
