package defpackage;

import android.os.Bundle;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ut1  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class ut1 implements ry9 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ut1(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.ry9
    public final Bundle a() {
        ArrayList<? extends Parcelable> arrayList;
        yk8[] yk8VarArr;
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                Bundle bundle = new Bundle();
                zt1 zt1Var = ((bu1) obj).E;
                zt1Var.getClass();
                LinkedHashMap linkedHashMap = zt1Var.b;
                bundle.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList<>(linkedHashMap.values()));
                bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList<>(linkedHashMap.keySet()));
                bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new ArrayList<>(zt1Var.d));
                bundle.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", new Bundle(zt1Var.g));
                return bundle;
            case 1:
                Map d = ((zx9) obj).d();
                Bundle bundle2 = new Bundle();
                for (Map.Entry entry : d.entrySet()) {
                    String str = (String) entry.getKey();
                    List list = (List) entry.getValue();
                    if (list instanceof ArrayList) {
                        arrayList = (ArrayList) list;
                    } else {
                        arrayList = new ArrayList<>(list);
                    }
                    bundle2.putParcelableArrayList(str, arrayList);
                }
                return bundle2;
            case 2:
                ur4 ur4Var = (ur4) obj;
                do {
                } while (ur4.o(((tr4) ur4Var.R.a).f));
                ur4Var.S.d(jn6.ON_STOP);
                return new Bundle();
            case 3:
                return ((hs4) obj).W();
            default:
                bm1 bm1Var = (bm1) obj;
                for (Map.Entry entry2 : o17.y((LinkedHashMap) bm1Var.e).entrySet()) {
                    bm1Var.Y(((cza) ((bw7) entry2.getValue())).getValue(), (String) entry2.getKey());
                }
                for (Map.Entry entry3 : o17.y((LinkedHashMap) bm1Var.c).entrySet()) {
                    bm1Var.Y(((ry9) entry3.getValue()).a(), (String) entry3.getKey());
                }
                LinkedHashMap linkedHashMap2 = (LinkedHashMap) bm1Var.b;
                if (linkedHashMap2.isEmpty()) {
                    yk8VarArr = new yk8[0];
                } else {
                    ArrayList arrayList2 = new ArrayList(linkedHashMap2.size());
                    for (Map.Entry entry4 : linkedHashMap2.entrySet()) {
                        arrayList2.add(new yk8((String) entry4.getKey(), entry4.getValue()));
                    }
                    yk8VarArr = (yk8[]) arrayList2.toArray(new yk8[0]);
                }
                return jsc.v((yk8[]) Arrays.copyOf(yk8VarArr, yk8VarArr.length));
        }
    }
}
