package defpackage;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: wl1  reason: default package */
/* loaded from: classes3.dex */
public abstract class wl1 extends vl1 {
    public static void N(List list) {
        if (list.size() > 1) {
            Collections.sort(list);
        }
    }

    public static void O(Comparator comparator, List list) {
        list.getClass();
        comparator.getClass();
        if (list.size() > 1) {
            Collections.sort(list, comparator);
        }
    }
}
