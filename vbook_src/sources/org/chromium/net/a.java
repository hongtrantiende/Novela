package org.chromium.net;

import java.util.Comparator;
import org.chromium.net.CronetEngine;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes3.dex */
public final class a implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        qc2 qc2Var = (qc2) obj;
        qc2 qc2Var2 = (qc2) obj2;
        if (CronetProvider.PROVIDER_NAME_FALLBACK.equals(qc2Var.a.getName())) {
            return 1;
        }
        if (CronetProvider.PROVIDER_NAME_FALLBACK.equals(qc2Var2.a.getName())) {
            return -1;
        }
        return -CronetEngine.Builder.compareVersions(qc2Var.a.getVersion(), qc2Var2.a.getVersion());
    }
}
