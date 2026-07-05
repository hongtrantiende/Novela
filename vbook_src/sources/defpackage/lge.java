package defpackage;

import android.os.SystemClock;
import com.google.mlkit.nl.languageid.IdentifiedLanguage;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.Callable;
import org.mozilla.javascript.Context;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: lge  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class lge implements Callable {
    public final /* synthetic */ qb6 a;
    public final /* synthetic */ dne b;
    public final /* synthetic */ String c;
    public final /* synthetic */ boolean d;

    public /* synthetic */ lge(qb6 qb6Var, dne dneVar, String str, boolean z) {
        this.a = qb6Var;
        this.b = dneVar;
        this.c = str;
        this.d = z;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        dne dneVar = this.b;
        String str = this.c;
        boolean z = this.d;
        qb6 qb6Var = this.a;
        Float f = qb6Var.a.a;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        try {
            ArrayList b = dneVar.b(str.substring(0, Math.min(str.length(), (int) Context.VERSION_ES6)), f.floatValue());
            Object[] objArr = new Object[4];
            int size = b.size();
            int i = 0;
            int i2 = 0;
            while (i < size) {
                Object obj = b.get(i);
                i++;
                IdentifiedLanguage identifiedLanguage = (IdentifiedLanguage) obj;
                rwa rwaVar = new rwa(21, false);
                rwaVar.c = identifiedLanguage.a;
                rwaVar.b = Float.valueOf(identifiedLanguage.b);
                ave aveVar = new ave(rwaVar);
                int i3 = i2 + 1;
                int length = objArr.length;
                if (length < i3) {
                    int i4 = length + (length >> 1) + 1;
                    if (i4 < i3) {
                        int highestOneBit = Integer.highestOneBit(i2);
                        i4 = highestOneBit + highestOneBit;
                    }
                    if (i4 < 0) {
                        i4 = Integer.MAX_VALUE;
                    }
                    objArr = Arrays.copyOf(objArr, i4);
                }
                objArr[i2] = aveVar;
                i2 = i3;
            }
            bp9 bp9Var = new bp9(19);
            bp9Var.b = ocf.f(i2, objArr);
            qb6Var.S(elapsedRealtime, z, new nve(bp9Var), xse.NO_ERROR);
            return b;
        } catch (RuntimeException e) {
            qb6Var.S(elapsedRealtime, z, null, xse.UNKNOWN_ERROR);
            throw e;
        }
    }
}
