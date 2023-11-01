package tu.nd20207638.com.example.affirmations.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Recycler
import tu.nd20207638.com.example.affirmations.R
import tu.nd20207638.com.example.affirmations.model.Affirmation

// adapter cho [RecyclerView] trong [MainActivity].
class ItemAdapter(private val context: Context, private val dataset: List<Affirmation>) : RecyclerView.Adapter<ItemAdapter.ItemViewHolder>()
{
   // Cung cấp tham chiếu đến các view cho từng mục dữ liệu
    // Các mục dữ liệu phức tạp có thể cần nhiều hơn một lượt xem cho mỗi mục và
// bạn cung cấp quyền truy cập vào tất cả các chế độ xem cho một mục dữ liệu trong chủ sở hữu chế độ xem.
// Mỗi mục dữ liệu chỉ là một đối tượng Affirmation.

    class ItemViewHolder(private val view: View) : RecyclerView.ViewHolder(view){
        val textView: TextView = view.findViewById(R.id.item_title)
    }


// tạo view mới
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemAdapter.ItemViewHolder {
        val adapterLayout = LayoutInflater.from(parent.context)
            .inflate(R.layout.list_item, parent, false)
        return ItemViewHolder(adapterLayout)
    }
// thay thế nội dung khung hình
    override fun onBindViewHolder(holder: ItemAdapter.ItemViewHolder, position: Int) {
        val item = dataset[position]
        holder.textView.text = context.resources.getString(item.stringResourceId)
    }
// trả về size của dataser
    override fun getItemCount(): Int {
        return dataset.size
    }

}