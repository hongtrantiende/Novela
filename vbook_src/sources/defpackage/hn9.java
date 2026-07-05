package defpackage;

import android.widget.RemoteViews;
import java.util.ArrayList;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: hn9  reason: default package */
/* loaded from: classes.dex */
public final class hn9 {
    public static final hn9 d = new hn9(new long[0], new RemoteViews[0], 1);
    public final long[] a;
    public final RemoteViews[] b;
    public final int c;

    public hn9(long[] jArr, RemoteViews[] remoteViewsArr, int i) {
        this.a = jArr;
        this.b = remoteViewsArr;
        this.c = i;
        if (jArr.length == remoteViewsArr.length) {
            if (i >= 1) {
                ArrayList arrayList = new ArrayList(remoteViewsArr.length);
                for (RemoteViews remoteViews : remoteViewsArr) {
                    arrayList.add(Integer.valueOf(remoteViews.getLayoutId()));
                }
                int size = sl1.C0(sl1.G0(arrayList)).size();
                if (size <= this.c) {
                    return;
                }
                p1a.k(hl5.j(this.c, size, ", but the collection contains ", " different layout ids", new StringBuilder("View type count is set to ")));
                throw null;
            }
            vs.m("View type count must be >= 1");
            throw null;
        }
        vs.m("RemoteCollectionItems has different number of ids and views");
        throw null;
    }
}
