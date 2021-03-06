package org.softcits.vp.service;

import java.util.List;

import org.softcits.vp.mapper.MbgComputerMapper;
import org.softcits.vp.model.MbgComputer;
import org.softcits.vp.model.MbgComputerExample;
import org.softcits.vp.model.PCPager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;

import com.github.pagehelper.PageHelper;

@Transactional(value = "transactionManager", rollbackFor = Exception.class, isolation = Isolation.READ_COMMITTED, timeout = 300)
@Service
public class ComputerService {
	
	@Autowired
	private MbgComputerMapper mbgComputerMapper;
	
	public List<MbgComputer> getComputers(){
		return mbgComputerMapper.selectByExample(null);
	}

	public void addComputer(MbgComputer mbgComputer) {
		
		mbgComputerMapper.insert(mbgComputer);
		
	}

	public MbgComputer queryComputerById(String id) {
		MbgComputerExample mgbComputerExa = new MbgComputerExample();
		MbgComputerExample.Criteria mbgComputerCri = mgbComputerExa.createCriteria();
		mbgComputerCri.andIdEqualTo(Integer.parseInt(id));
		return mbgComputerMapper.selectByExample(mgbComputerExa).get(0);
	}
	
	public PCPager<MbgComputer> getComputersByPager(Integer pageNum, Integer rows){
		PageHelper.startPage(pageNum, rows);
		List<MbgComputer> mbgComputerList = mbgComputerMapper.selectByExample(null);
		PCPager<MbgComputer> pcPager = new PCPager<MbgComputer>();
		pcPager.setData(mbgComputerList);
		pcPager.setRows(rows);
		pcPager.setPageNum(pageNum);
		Long totalPage = mbgComputerMapper.countByExample(null);
		pcPager.setTotalRows(totalPage);
		return pcPager;
	}
	
	public MbgComputer queryComputerByTradeMark(String tradeMark) {
		MbgComputerExample mgbComputerExa = new MbgComputerExample();
		MbgComputerExample.Criteria mbgComputerCri = mgbComputerExa.createCriteria();
		mbgComputerCri.andTrademarkEqualTo(tradeMark);
		List<MbgComputer> mbgPCList = mbgComputerMapper.selectByExample(mgbComputerExa);
		if(mbgPCList.size() > 0) {
			return mbgPCList.get(0);
		}
		else return null;
	}
}
