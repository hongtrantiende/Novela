package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.widget.RemoteViews;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: uu5  reason: default package */
/* loaded from: classes.dex */
public final class uu5 {
    public boolean a;
    public int b;
    public Object c;
    public Object d;

    public uu5(Parcel parcel) {
        parcel.getClass();
        int readInt = parcel.readInt();
        long[] jArr = new long[readInt];
        this.c = jArr;
        parcel.readLongArray(jArr);
        Parcelable.Creator creator = RemoteViews.CREATOR;
        creator.getClass();
        RemoteViews[] remoteViewsArr = new RemoteViews[readInt];
        parcel.readTypedArray(remoteViewsArr, creator);
        for (int i = 0; i < readInt; i++) {
            if (remoteViewsArr[i] == null) {
                cp8.n(remoteViewsArr, "null element found in ");
                throw null;
            }
        }
        this.d = remoteViewsArr;
        this.a = parcel.readInt() == 1;
        this.b = parcel.readInt();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [uu5, java.lang.Object] */
    public static uu5 b() {
        ?? obj = new Object();
        obj.a = true;
        obj.b = 0;
        return obj;
    }

    public static uu5 c(char c) {
        return new uu5(new xk9(new fc1(c), 7));
    }

    public static uu5 d(String str) {
        boolean z;
        if (str.length() != 0) {
            z = true;
        } else {
            z = false;
        }
        wq9.r("The separator may not be the empty string.", z);
        if (str.length() == 1) {
            return c(str.charAt(0));
        }
        return new uu5(new fje(5, str, false));
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [uu5, java.lang.Object] */
    public uu5 a() {
        boolean z;
        if (((gn9) this.c) != null) {
            z = true;
        } else {
            z = false;
        }
        am8.m("execute parameter required", z);
        mb4[] mb4VarArr = (mb4[]) this.d;
        boolean z2 = this.a;
        int i = this.b;
        ?? obj = new Object();
        obj.d = this;
        obj.c = mb4VarArr;
        boolean z3 = false;
        if (mb4VarArr != null && z2) {
            z3 = true;
        }
        obj.a = z3;
        obj.b = i;
        return obj;
    }

    public List e(CharSequence charSequence) {
        charSequence.getClass();
        Iterator a = ((exa) this.d).a(this, charSequence);
        ArrayList arrayList = new ArrayList();
        while (true) {
            cxa cxaVar = (cxa) a;
            if (cxaVar.hasNext()) {
                arrayList.add((String) cxaVar.next());
            } else {
                return Collections.unmodifiableList(arrayList);
            }
        }
    }

    public uu5(exa exaVar, boolean z, ec1 ec1Var, int i) {
        this.d = exaVar;
        this.a = z;
        this.c = ec1Var;
        this.b = i;
    }

    public uu5(exa exaVar) {
        this(exaVar, false, hc1.b, Integer.MAX_VALUE);
    }
}
