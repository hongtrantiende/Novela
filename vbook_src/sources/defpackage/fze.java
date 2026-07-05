package defpackage;

import com.google.android.gms.tasks.Task;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: fze  reason: default package */
/* loaded from: classes.dex */
public final class fze extends x1 {
    public Task D;

    @Override // defpackage.x1
    public final void c() {
        this.D = null;
    }

    @Override // defpackage.x1
    public final String j() {
        Task task = this.D;
        if (task == null) {
            return "";
        }
        return task.toString();
    }
}
