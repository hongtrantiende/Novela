package defpackage;

import android.text.TextUtils;
import java.lang.ref.WeakReference;
import java.util.ArrayDeque;
import java.util.regex.Pattern;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: dic  reason: default package */
/* loaded from: classes.dex */
public final class dic {
    public static WeakReference b;
    public bm1 a;

    public final synchronized cic a() {
        String str;
        cic cicVar;
        bm1 bm1Var = this.a;
        synchronized (((ArrayDeque) bm1Var.e)) {
            str = (String) ((ArrayDeque) bm1Var.e).peek();
        }
        Pattern pattern = cic.d;
        cicVar = null;
        if (!TextUtils.isEmpty(str)) {
            String[] split = str.split("!", -1);
            if (split.length == 2) {
                cicVar = new cic(split[0], split[1]);
            }
        }
        return cicVar;
    }
}
