package com.example.todoappkotlin.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.example.todoappkotlin.R;
import com.example.todoappkotlin.model.Student;

import java.util.List;


public class StudentAdapter extends RecyclerView.Adapter<StudentAdapter.StudentViewHoder> {
    private List<Student> listStudent;

    public StudentAdapter(List<Student> listStudent) {
        this.listStudent = listStudent;
    }

    @NonNull
    @Override
    public StudentViewHoder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_student,parent, false);
        return new StudentViewHoder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull StudentViewHoder holder, int position) {
        Student student = listStudent.get(position);
        if(student == null){
            return;
        }

        holder.maSinhVien.setText(student.getMaSinhVien());
        holder.tenSinhVien.setText(student.getTenSinhVien());
    }

    @Override
    public int getItemCount() {
        if(listStudent != null){
            return listStudent.size();
        }

        return 0;
    }

    class StudentViewHoder extends RecyclerView.ViewHolder {
        private TextView maSinhVien;
        private TextView tenSinhVien;
        private ImageView hinhAnh;
        public StudentViewHoder(@NonNull View itemView) {
            super(itemView);
            maSinhVien  = itemView.findViewById(R.id.ma_sinh_vien);
            tenSinhVien = itemView.findViewById(R.id.ten_sinh_vien);
            hinhAnh = itemView.findViewById(R.id.image_view);
        }
    }
}
